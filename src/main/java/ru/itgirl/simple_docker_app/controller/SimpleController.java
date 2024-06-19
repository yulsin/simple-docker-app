package ru.itgirl.simple_docker_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/")
    public String hello() {
        return "Hello Docker!";
    }
}
