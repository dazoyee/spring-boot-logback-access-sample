package com.github.ioridazo.spring.boot.logback.access.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootLogbackAccessSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLogbackAccessSampleApplication.class, args);
    }

    @GetMapping("hello")
    public String hello() {
        return "{\"response\": \"hello\"}";
    }
}
