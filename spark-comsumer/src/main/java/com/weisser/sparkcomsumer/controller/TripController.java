package com.weisser.sparkcomsumer.controller;

import com.weisser.sparkcomsumer.model.Trip;
import com.weisser.sparkcomsumer.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RequestMapping
@RestController
public class TripController {

    @Autowired
    TripService service;

    @PostMapping("/trip_count ")
    public Map<Long, Long> count(@RequestBody(required = false) Trip trip) {

        return null;
    }

}
