package com.demo.kafkaconsumidor.service;

import lombok.extern.slf4j.Slf4j;
// import org.apache.commons.logging.Log;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Slf4j
@EnableBinding(Sink.class)
@Service
public class MessageService {

    @StreamListener(Sink.INPUT)
    public void read(Message<String> message){
        log.info("message: " + message.getPayload());
    }

    @StreamListener(Sink.INPUT)
    public void read(com.demo.kafkaconsumidor.model.Message message){
        log.info("message: " + message);
    }
}
