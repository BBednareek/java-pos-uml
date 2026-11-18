package pl.pos.port;

import pl.pos.domain.Order;
import java.util.Optional;

/** Persistence boundary; production adapter is intentionally not tied to a vendor. */
public interface OrderRepository {
    Optional<Order> findById(String orderId);
    Order save(Order order);
}
