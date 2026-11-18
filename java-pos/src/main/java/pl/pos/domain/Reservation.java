package pl.pos.domain;

/** Odwzorowanie klasy UML Reservation; kwoty przechowywane są jako BigDecimal. */
public record Reservation(String id, String localId, String guestName, int guests, java.time.OffsetDateTime startsAt, ReservationStatus status) {
    public Reservation {
    }
}
