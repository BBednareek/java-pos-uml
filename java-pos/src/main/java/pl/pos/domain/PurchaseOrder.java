package pl.pos.domain;

/** Odwzorowanie klasy UML PurchaseOrder; kwoty przechowywane są jako BigDecimal. */
public record PurchaseOrder(String id, String localId, String supplierId, PurchaseOrderStatus status, java.util.List<PurchaseOrderLine> lines) {
    public PurchaseOrder {
        lines = java.util.List.copyOf(lines);
    }
}
