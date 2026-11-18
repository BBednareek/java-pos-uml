package pl.pos.domain;

/** Odwzorowanie klasy UML DemandForecast; kwoty przechowywane są jako BigDecimal. */
public record DemandForecast(String id, String localId, java.time.LocalDate periodStart, java.time.LocalDate periodEnd, java.util.Map<String, java.math.BigDecimal> quantities) {
    public DemandForecast {
    }
}
