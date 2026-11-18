package pl.pos.domain;

/** Odwzorowanie klasy UML TerminalSettlement; kwoty przechowywane są jako BigDecimal. */
public record TerminalSettlement(String id, String localId, java.time.LocalDate businessDate, java.util.List<TerminalSettlementLine> lines) {
    public TerminalSettlement {
        lines = java.util.List.copyOf(lines);
    }
}
