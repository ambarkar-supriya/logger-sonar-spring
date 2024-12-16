package com.example.sonar;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarSpringAppApplication {
    private static final Logger logger = LoggerFactory.getLogger(SonarSpringAppApplication.class);

    public static void main(String[] args) {
        logger.info("Starting Sonar Spring Application...");
        SpringApplication.run(SonarSpringAppApplication.class, args);
        logger.info("Application started successfully!");
    }
}
