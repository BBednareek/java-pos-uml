package pl.pos.domain;

/** Odwzorowanie klasy UML InventoryBatch; kwoty przechowywane są jako BigDecimal. */
public record InventoryBatch(String id, String localId, String productId, java.math.BigDecimal quantity, java.time.LocalDate expiresOn) {
    public InventoryBatch {
    }
}
