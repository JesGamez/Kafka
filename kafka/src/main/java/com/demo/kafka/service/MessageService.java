package com.demo.kafka.service;

import com.demo.kafka.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@EnableBinding(Source.class)
@Service
public class MessageService {

    @Autowired
    // Source es para el productor
    private Source source;

    @SendTo
    public boolean send(Message message){
        // enviamos un mensaje mediante este productor
        return source.output().send(MessageBuilder.withPayload(message).build());
    }
}
