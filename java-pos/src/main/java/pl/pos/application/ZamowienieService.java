package pl.pos.application;

import pl.pos.domain.KitchenCheck;
import pl.pos.domain.MenuItem;
import pl.pos.domain.Order;

/** Nazwa usługi zgodna z UML, delegująca do implementacji przypadków użycia. */
public final class ZamowienieService {
    private final OrderService delegate;
    public ZamowienieService(OrderService delegate) { this.delegate = delegate; }
    public Order utworzZamowienie(String lokalId, String kanal) { return delegate.createOrder(lokalId, kanal); }
    public Order dodajPozycje(String zamowienieId, MenuItem pozycja, int ilosc, String uwagi) {
        return delegate.addItem(zamowienieId, pozycja, ilosc, uwagi);
    }
    public KitchenCheck przekazDoKuchni(String zamowienieId) { return delegate.publishKitchenCheck(zamowienieId); }
}
