package pl.pos.domain;

/** Odwzorowanie klasy UML RoleAssignment; kwoty przechowywane są jako BigDecimal. */
public record RoleAssignment(String id, String employeeId, String roleId, String localId, RoleAssignmentStatus status) {
    public RoleAssignment {
    }
}
