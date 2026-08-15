package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello! Java DevOps Application is running successfully.";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is UP";
    }

    @GetMapping("/devops")
    public String devops() {
        return "Welcome to the DevOps CI/CD Project!";
    }
}