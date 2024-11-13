package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {

    // Redirect to home page (home.html)
    @GetMapping("/")
    public String redirectToHome() {
        return "/index.html";  // Redirect to home.html
    }

    // Main method to start the application
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
