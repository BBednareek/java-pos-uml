package pl.pos.port;

import java.math.BigDecimal;

/** Payment terminal contract. The returned amount is the amount confirmed by the terminal. */
public interface PaymentTerminalPort {
    TerminalResult charge(String terminalId, BigDecimal amount, BigDecimal tip);
    record TerminalResult(boolean approved, BigDecimal confirmedAmount, String reference) {}
}
