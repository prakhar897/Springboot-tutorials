package com.example.kafka.resource;

import com.example.kafka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResouce {

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;
    public static String topic = "Kafka_Example";

    @GetMapping("/publish/{name}")
    public String post(@PathVariable("name") String name){
        kafkaTemplate.send(topic,new User(name,"Tech"));
        return "Published successfully";
    }

}
