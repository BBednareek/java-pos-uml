package pl.pos.domain;

/** Odwzorowanie klasy UML Terminal; kwoty przechowywane są jako BigDecimal. */
public record Terminal(String id, String localId, String name) {
    public Terminal {
    }
}
