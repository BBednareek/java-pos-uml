package pl.pos.domain;

/** Odwzorowanie klasy UML Local; kwoty przechowywane są jako BigDecimal. */
public record Local(String id, String name, int capacity) {
    public Local {
    }
}
