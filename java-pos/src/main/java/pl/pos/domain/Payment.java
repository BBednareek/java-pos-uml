package pl.pos.domain;

/** Odwzorowanie klasy UML Payment; kwoty przechowywane są jako BigDecimal. */
public record Payment(String id, String billId, PaymentMethod method, java.math.BigDecimal amount, PaymentStatus status, String externalReference) {
    public Payment {
        if (amount == null || amount.signum() < 0) throw new IllegalArgumentException("amount musi być nieujemne");
    }
}
