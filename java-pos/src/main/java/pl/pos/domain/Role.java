package pl.pos.domain;

/** Odwzorowanie klasy UML Role; kwoty przechowywane są jako BigDecimal. */
public record Role(String id, String name, java.util.Set<String> permissionIds) {
    public Role {
        permissionIds = java.util.Set.copyOf(permissionIds);
    }
}
