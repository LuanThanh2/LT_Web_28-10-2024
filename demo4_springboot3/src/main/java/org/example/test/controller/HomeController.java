package org.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index"; // Spring Boot và Thymeleaf sẽ tìm file index.html trong /templates
    }
}

