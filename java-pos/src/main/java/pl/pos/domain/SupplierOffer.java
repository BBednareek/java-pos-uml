package pl.pos.domain;

/** Odwzorowanie klasy UML SupplierOffer; kwoty przechowywane są jako BigDecimal. */
public record SupplierOffer(String id, String supplierId, String productId, java.math.BigDecimal unitPrice) {
    public SupplierOffer {
        if (unitPrice == null || unitPrice.signum() < 0) throw new IllegalArgumentException("unitPrice musi być nieujemne");
    }
}
