package pl.pos.domain;

/** Odwzorowanie klasy UML Receipt; kwoty przechowywane są jako BigDecimal. */
public record Receipt(String id, String billId, java.time.OffsetDateTime printedAt, java.math.BigDecimal total) {
    public Receipt {
        if (total == null || total.signum() < 0) throw new IllegalArgumentException("total musi być nieujemne");
    }
}
