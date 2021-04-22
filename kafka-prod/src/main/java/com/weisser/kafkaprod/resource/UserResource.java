package com.weisser.kafkaprod.resource;

import com.weisser.kafkaprod.model.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class UserResource {

    @Autowired
    private KafkaTemplate<String, Trip> kafkaTemplate;

    private static final String TOPIC = "Trips";

    @PostMapping("/publish")
    public String post(@RequestBody Trip trip) {

        kafkaTemplate.send(TOPIC, trip);

        return "Published successfully";
    }
}
