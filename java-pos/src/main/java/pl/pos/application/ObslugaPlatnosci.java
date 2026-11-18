package pl.pos.application;

import pl.pos.domain.Payment;
import java.math.BigDecimal;

/** Nazwa obsługi płatności zgodna z UML. */
public final class ObslugaPlatnosci {
    private final PaymentService delegate;
    public ObslugaPlatnosci(PaymentService delegate) { this.delegate = delegate; }
    public Payment przyjmijKarte(String rachunekId, String terminalId, BigDecimal kwota, BigDecimal napiwek) {
        return delegate.payByCard(rachunekId, terminalId, kwota, napiwek);
    }
}
