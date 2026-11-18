package pl.pos.domain;

/** Odwzorowanie klasy UML DeliveryInvoice; kwoty przechowywane są jako BigDecimal. */
public record DeliveryInvoice(String id, String deliveryId, String invoiceNumber, java.math.BigDecimal total) {
    public DeliveryInvoice {
    }
}
