package com.kafka.kafkaDemo.Controller;

import com.kafka.kafkaDemo.kafka.JsonKafkaProducer;
import com.kafka.kafkaDemo.kafka.KafkaProducer;
import com.kafka.kafkaDemo.payload.User;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/producer")
public class MessageController {
   @Autowired
    KafkaProducer kafkaProducer;
   @Autowired
    JsonKafkaProducer jsonKafkaProducer;


   @PostMapping("/send")
   public ResponseEntity<String>sendMessagetoTopic(@RequestParam("message")String message){
       kafkaProducer.produceMessage(message);
       return ResponseEntity.ok("MessageSent successfully to topic");
   }
   @PostMapping("/sendJson")
    public ResponseEntity<String>sendJsonToTopic(@RequestBody User user){
       jsonKafkaProducer.sendJsonMessage(user);
       return ResponseEntity.ok(" Json Message sent successfully to topic ");
   }

}
