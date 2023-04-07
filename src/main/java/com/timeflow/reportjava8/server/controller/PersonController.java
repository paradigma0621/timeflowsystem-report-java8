package com.timeflow.reportjava8.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private Environment environment;

    @GetMapping(value = "/getPersonMsg")
    public String getSaudation(String name) {

        String port = environment.getProperty("local.server.port");

        String msg = "How are you, " + name + "? Running in port: " + port + ". ";
        System.out.println(msg);

        return msg;
    }

}
