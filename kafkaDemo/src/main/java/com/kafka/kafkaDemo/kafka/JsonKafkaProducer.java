package com.kafka.kafkaDemo.kafka;
import com.kafka.kafkaDemo.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);

    private KafkaTemplate<String, User>kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String,User>kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;

    }
    public void sendJsonMessage(User data){
        Message<User>message= MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC,"jsonTopic10")
                .build();
        LOGGER.info("JSON message sent to kafka>>>>>>>>>>>>>>");
        kafkaTemplate.send(message);
    }

}
