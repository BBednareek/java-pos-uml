package pl.pos.application;

import pl.pos.domain.*;
import pl.pos.port.KitchenQueuePort;
import pl.pos.port.OrderRepository;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Application service for the UML create/edit order and kitchen-check operations. */
public final class OrderService {
    private final OrderRepository orders;
    private final KitchenQueuePort kitchen;

    public OrderService(OrderRepository orders, KitchenQueuePort kitchen) {
        this.orders = orders;
        this.kitchen = kitchen;
    }

    public Order createOrder(String localId, String channel) {
        return orders.save(new Order(UUID.randomUUID().toString(), localId, channel, OrderStatus.OPEN, List.of()));
    }

    public Order addItem(String orderId, MenuItem menuItem, int quantity, String notes) {
        if (quantity <= 0) throw new IllegalArgumentException("Ilość musi być większa od zera");
        Order old = orders.findById(orderId).orElseThrow(() -> new IllegalArgumentException("Nie znaleziono zamówienia: " + orderId));
        if (old.status() != OrderStatus.OPEN) throw new IllegalStateException("Zamówienie nie jest otwarte");
        var items = new java.util.ArrayList<>(old.items());
        items.add(new OrderItem(menuItem.id(), menuItem.name(), quantity, menuItem.price(), notes));
        return orders.save(new Order(old.id(), old.localId(), old.channel(), old.status(), items));
    }

    public KitchenCheck publishKitchenCheck(String orderId) {
        Order old = orders.findById(orderId).orElseThrow(() -> new IllegalArgumentException("Nie znaleziono zamówienia: " + orderId));
        if (old.items().isEmpty()) throw new IllegalStateException("Nie można wysłać pustego zamówienia");
        KitchenCheck check = new KitchenCheck(UUID.randomUUID().toString(), old.id(), OffsetDateTime.now(), KitchenStatus.QUEUED, old.items());
        kitchen.publish(check);
        orders.save(new Order(old.id(), old.localId(), old.channel(), OrderStatus.SENT_TO_KITCHEN, old.items()));
        return check;
    }
}
