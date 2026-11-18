package pl.pos.domain;

/** Odwzorowanie klasy UML KitchenCheck; kwoty przechowywane są jako BigDecimal. */
public record KitchenCheck(String id, String orderId, java.time.OffsetDateTime createdAt, KitchenStatus status, java.util.List<OrderItem> items) {
    public KitchenCheck {
        items = java.util.List.copyOf(items);
    }
}
