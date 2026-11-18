package pl.pos.domain;

/** Odwzorowanie klasy UML Delivery; kwoty przechowywane są jako BigDecimal. */
public record Delivery(String id, String localId, String purchaseOrderId, java.time.OffsetDateTime receivedAt, java.util.List<InventoryBatch> batches) {
    public Delivery {
        batches = java.util.List.copyOf(batches);
    }
}
