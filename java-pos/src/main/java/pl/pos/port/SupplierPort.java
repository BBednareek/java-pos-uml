package pl.pos.port;

import java.util.List;
import pl.pos.domain.PurchaseOrder;

public interface SupplierPort {
    SupplierSubmission submit(PurchaseOrder order);
    record SupplierSubmission(boolean accepted, String reference, List<String> messages) {
        public SupplierSubmission { messages = List.copyOf(messages); }
    }
}
