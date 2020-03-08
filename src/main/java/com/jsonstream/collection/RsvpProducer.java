//package com.jsonstream.collection;
//import org.springframework.cloud.stream.messaging.Source;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.messaging.Source;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.WebSocketMessage;
//
//@Component
//@EnableBinding(Source.class)
//
//public class RsvpProducer {
//    private final int TIME_OUT_MS = 10000;
//
//    private final Source source;
//
//    RsvpProducer(Source source){
//        this.source = source;
//    }
//
//
//    public void sendMessage(WebSocketMessage<?> message){
//
//        source.output().send(MessageBuilder.withPayload(message.getPayload()).build(),TIME_OUT_MS);
//    }
//
//}
