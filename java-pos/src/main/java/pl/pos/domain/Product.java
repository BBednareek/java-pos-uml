package pl.pos.domain;

/** Odwzorowanie klasy UML Product; kwoty przechowywane są jako BigDecimal. */
public record Product(String id, String name, ProductCategory category, String unit) {
    public Product {
    }
}
