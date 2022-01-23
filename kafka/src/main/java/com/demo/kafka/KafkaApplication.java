package com.demo.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {
    // productor de kafka
    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

}
