package pl.pos.domain;

/** Odwzorowanie klasy UML AuditEntry; kwoty przechowywane są jako BigDecimal. */
public record AuditEntry(String id, String localId, String actorId, String action, java.time.OffsetDateTime occurredAt, String details) {
    public AuditEntry {
    }
}
