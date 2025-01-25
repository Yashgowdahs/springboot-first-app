package com.yash.springboot_first_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

@GetMapping("/Hello")
    public String Hello() {
        return " Welcome to Spring Boot World!";
    }
}
