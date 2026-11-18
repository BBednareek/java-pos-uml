package pl.pos.port;

import pl.pos.domain.KitchenCheck;

public interface KitchenQueuePort {
    void publish(KitchenCheck check);
}
