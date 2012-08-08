package com.datasift.dropwizard.kafka.consumer;

import com.yammer.dropwizard.lifecycle.Managed;

/**
 * Interface for consuming a stream of type {@code T} from Kafka.
 */
public interface KafkaConsumer<T> extends Managed {

    /**
     * Commit the offsets of the current position in the message streams.
     *
     * @see kafka.consumer.ConsumerConnector#commitOffsets()
     */
    public void commitOffsets();
}