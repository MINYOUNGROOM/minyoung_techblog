package com.adcapsule.TechInsight.apis.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }



}
