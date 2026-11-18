package pl.pos.domain;

/** Odwzorowanie klasy UML Recipe; kwoty przechowywane są jako BigDecimal. */
public record Recipe(String id, String dishId, int version, java.util.List<RecipeIngredient> ingredients) {
    public Recipe {
        ingredients = java.util.List.copyOf(ingredients);
    }
}
