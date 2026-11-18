package pl.pos.domain;

/** Odwzorowanie klasy UML TerminalSettlementLine; kwoty przechowywane są jako BigDecimal. */
public record TerminalSettlementLine(String terminalId, java.math.BigDecimal amount, java.time.OffsetDateTime settledAt) {
    public TerminalSettlementLine {
    }
}
