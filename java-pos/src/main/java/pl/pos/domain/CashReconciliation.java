package pl.pos.domain;

/** Odwzorowanie klasy UML CashReconciliation; kwoty przechowywane są jako BigDecimal. */
public record CashReconciliation(String id, String localId, java.time.LocalDate businessDate, java.math.BigDecimal expectedCash, java.math.BigDecimal countedCash, java.math.BigDecimal cardTotal) {
    public CashReconciliation {
    }
}
