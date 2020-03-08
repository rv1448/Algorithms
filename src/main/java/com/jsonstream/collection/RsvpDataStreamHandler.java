//package com.jsonstream.collection;
//
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.WebSocketMessage;
//import org.springframework.web.socket.WebSocketSession;
//import org.springframework.web.socket.handler.AbstractWebSocketHandler;
//
//@Component
//public class RsvpDataStreamHandler extends AbstractWebSocketHandler {
//
//    private final RsvpProducer rsvpProducer;
//
//    public RsvpDataStreamHandler(RsvpProducer rsvpproducer) {
//        this.rsvpProducer = rsvpproducer;
//    }
//
//
//    @Override
//    public void handleMessage(WebSocketSession session,
//                              WebSocketMessage<?> message) {
//       // System.out.println(message.getPayload());
//        System.out.println("4");
//        System.out.println(message.getPayloadLength()+":"+message.getPayload());
//        rsvpProducer.sendMessage(message);
//    }
//
//}
