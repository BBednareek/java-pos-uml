package pl.pos.domain;

/** Odwzorowanie klasy UML Table; kwoty przechowywane są jako BigDecimal. */
public record Table(String id, String localId, String label, int seats) {
    public Table {
    }
}
