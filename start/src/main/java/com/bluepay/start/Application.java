package com.bluepay.start;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bluepay"})
@Slf4j
public class Application {
    public static void main(String[] args) {
        System.setProperty("spring.config.location", "classpath:rabbitmq.properties");
        SpringApplication.run(Application.class, args);
        log.info("wallet service started. ");
    }
}
