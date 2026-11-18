package pl.pos.domain;

/** Odwzorowanie klasy UML DishOfTheDay; kwoty przechowywane są jako BigDecimal. */
public record DishOfTheDay(String id, String localId, String dishId, java.time.LocalDate servesOn, boolean approved) {
    public DishOfTheDay {
    }
}
