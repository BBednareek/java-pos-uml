package pl.pos.domain;

/** Odwzorowanie klasy UML PurchaseOrderLine; kwoty przechowywane są jako BigDecimal. */
public record PurchaseOrderLine(String productId, java.math.BigDecimal quantity, java.math.BigDecimal unitPrice) {
    public PurchaseOrderLine {
        if (quantity == null || quantity.signum() < 0) throw new IllegalArgumentException("quantity musi być nieujemne");
    }
}
