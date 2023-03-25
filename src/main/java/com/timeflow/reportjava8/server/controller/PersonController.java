package com.timeflow.reportjava8.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @GetMapping(value = "/getPersonMsg")
    public String getSaudation(String name) {
        String msg = "How are you " + name + "?";
        System.out.println(msg);

        return msg;
    }

}
