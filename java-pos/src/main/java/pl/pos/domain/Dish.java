package pl.pos.domain;

/** Odwzorowanie klasy UML Dish; kwoty przechowywane są jako BigDecimal. */
public record Dish(String id, String localId, String name, java.math.BigDecimal price, boolean available) {
    public Dish {
        if (price == null || price.signum() < 0) throw new IllegalArgumentException("price musi być nieujemne");
    }
}
