package com.demo.kafka.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Message {
    private String author;
    private String text;
}
