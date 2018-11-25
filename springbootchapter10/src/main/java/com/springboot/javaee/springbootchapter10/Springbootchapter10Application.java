package com.springboot.javaee.springbootchapter10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Springbootchapter10Application {

    @RequestMapping("/home")
    public String home() {
        return "hello Docker";
    }

    public static void main(String[] args) {
        SpringApplication.run(Springbootchapter10Application.class, args);
    }
}
