package pl.pos.domain;

/** Odwzorowanie klasy UML MenuItem; kwoty przechowywane są jako BigDecimal. */
public record MenuItem(String id, String localId, String name, java.math.BigDecimal price, boolean available) {
    public MenuItem {
        if (price == null || price.signum() < 0) throw new IllegalArgumentException("price musi być nieujemne");
    }
}
