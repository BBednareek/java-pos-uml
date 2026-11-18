package pl.pos.domain;

/** Odwzorowanie klasy UML OrderItem; kwoty przechowywane są jako BigDecimal. */
public record OrderItem(String menuItemId, String nameSnapshot, int quantity, java.math.BigDecimal unitPriceSnapshot, String notes) {
    public OrderItem {
    }
}
