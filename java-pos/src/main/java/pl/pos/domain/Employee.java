package pl.pos.domain;

/** Odwzorowanie klasy UML Employee; kwoty przechowywane są jako BigDecimal. */
public record Employee(String id, String name) {
    public Employee {
    }
}
