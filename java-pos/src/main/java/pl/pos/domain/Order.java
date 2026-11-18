package pl.pos.domain;

/** Odwzorowanie klasy UML Order; kwoty przechowywane są jako BigDecimal. */
public record Order(String id, String localId, String channel, OrderStatus status, java.util.List<OrderItem> items) {
    public Order {
        items = java.util.List.copyOf(items);
    }
}
