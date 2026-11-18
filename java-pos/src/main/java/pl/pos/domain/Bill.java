package pl.pos.domain;

/** Odwzorowanie klasy UML Bill; kwoty przechowywane są jako BigDecimal. */
public record Bill(String id, String localId, String orderId, java.math.BigDecimal total, java.util.List<BillLine> lines) {
    public Bill {
        if (total == null || total.signum() < 0) throw new IllegalArgumentException("total musi być nieujemne");
        lines = java.util.List.copyOf(lines);
    }
}
