//package com.jsonstream.collection;
//
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.socket.client.AbstractWebSocketClient;
//import org.springframework.web.socket.client.standard.StandardWebSocketClient;
//
//@SpringBootApplication
//public class Application {
//    private static final String JSON_STREAM_ENDPOINT = "ws://stream.meetup.com/2/rsvps";
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class);
//        System.out.println("0");
//    }
//
//
//    public ApplicationRunner initializeconnect(RsvpDataStreamHandler stream){
//
//        System.out.println("1");
//
//        return  args -> {
//            System.out.println("2");
//            AbstractWebSocketClient client = new StandardWebSocketClient();
//            System.out.println("3");
//            client.doHandshake(stream,JSON_STREAM_ENDPOINT);
//
//        };
//    }
//
//}
