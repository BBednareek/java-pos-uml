package pl.pos.domain;

/** Odwzorowanie klasy UML GiftVoucher; kwoty przechowywane są jako BigDecimal. */
public record GiftVoucher(String id, String code, java.math.BigDecimal balance) {
    public GiftVoucher {
        if (balance == null || balance.signum() < 0) throw new IllegalArgumentException("balance musi być nieujemne");
    }
}
