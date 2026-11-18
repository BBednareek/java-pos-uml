package pl.pos.domain;

/** Odwzorowanie klasy UML BillLine; kwoty przechowywane są jako BigDecimal. */
public record BillLine(String id, String billId, java.math.BigDecimal amount, String description) {
    public BillLine {
        if (amount == null || amount.signum() < 0) throw new IllegalArgumentException("amount musi być nieujemne");
    }
}
