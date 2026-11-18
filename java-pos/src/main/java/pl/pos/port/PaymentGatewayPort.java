package pl.pos.port;

import java.math.BigDecimal;

/** External payment-link integration contract. */
public interface PaymentGatewayPort {
    String createPaymentLink(String orderId, BigDecimal amount);
    boolean isPaymentConfirmed(String externalReference);
}
