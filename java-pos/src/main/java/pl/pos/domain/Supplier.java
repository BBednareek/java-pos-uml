package pl.pos.domain;

/** Odwzorowanie klasy UML Supplier; kwoty przechowywane są jako BigDecimal. */
public record Supplier(String id, String name, String contact) {
    public Supplier {
    }
}
