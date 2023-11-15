package com.techgeek.kafka.serialization.consumer;

import com.techgeek.kafka.serialization.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaSrlzConsumer {
    Logger log = LoggerFactory.getLogger(KafkaSrlzConsumer.class);

    @KafkaListener(topics = "techgeek-topic1", groupId = "geek-cons-grp-4")
    public void consumeCustomer(Customer cst){
        log.info("consumeCustomer object consumed {}", cst.toString());
    }

}
