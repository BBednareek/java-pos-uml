package pl.pos.domain;

/** Odwzorowanie klasy UML RecipeIngredient; kwoty przechowywane są jako BigDecimal. */
public record RecipeIngredient(String productId, java.math.BigDecimal quantity, String unit) {
    public RecipeIngredient {
    }
}
