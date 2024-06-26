package com.tkachov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.tkachov.config")
public class ApplicationContext {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationContext.class, args);
    }

}
