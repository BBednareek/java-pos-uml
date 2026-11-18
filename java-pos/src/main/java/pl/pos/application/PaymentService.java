package pl.pos.application;

import pl.pos.domain.Payment;
import pl.pos.domain.PaymentMethod;
import pl.pos.domain.PaymentStatus;
import pl.pos.port.PaymentTerminalPort;
import java.math.BigDecimal;
import java.util.UUID;

/** Coordinates card payments and preserves terminal-confirmed values. */
public final class PaymentService {
    private final PaymentTerminalPort terminal;
    public PaymentService(PaymentTerminalPort terminal) { this.terminal = terminal; }

    public Payment payByCard(String billId, String terminalId, BigDecimal amount, BigDecimal tip) {
        if (amount == null || amount.signum() <= 0) throw new IllegalArgumentException("Kwota musi być większa od zera");
        if (tip == null || tip.signum() < 0) throw new IllegalArgumentException("Napiwek musi być nieujemny");
        var result = terminal.charge(terminalId, amount, tip);
        return new Payment(UUID.randomUUID().toString(), billId, PaymentMethod.CARD,
                result.confirmedAmount(), result.approved() ? PaymentStatus.CAPTURED : PaymentStatus.DECLINED, result.reference());
    }
}
