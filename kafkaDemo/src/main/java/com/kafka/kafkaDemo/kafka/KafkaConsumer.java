package com.kafka.kafkaDemo.kafka;

import com.kafka.kafkaDemo.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "topic1",groupId = "myGroup")
    public void messageConsumer(String message){

        LOGGER.info(String.format("MessageReceived#",message));
    }

}
