package pl.pos.domain;

/** Odwzorowanie klasy UML Permission; kwoty przechowywane są jako BigDecimal. */
public record Permission(String id, String code, String description) {
    public Permission {
    }
}
