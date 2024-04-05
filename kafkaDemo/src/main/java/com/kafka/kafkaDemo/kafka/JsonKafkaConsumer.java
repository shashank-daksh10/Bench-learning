package com.kafka.kafkaDemo.kafka;

import com.kafka.kafkaDemo.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "jsonTopic10",groupId = "myGroup")
    public void UserConsumer(User user){

        LOGGER.info(String.format("JSonMessageReceived#",user.toString()));
        System.out.println(user.getFirstName());
    }
}
