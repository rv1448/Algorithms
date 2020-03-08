package com.video;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


// Tell spring that this is a configuration object that represents
// configuration of the application
@Configuration

// Tell spring to turn on webmvc(it should enable the dispatcher servlet)
@EnableWebMvc

//tell spring to scan all sub packages for controller objects
// any object with @Controller will be discovered and connected to the dispatcher
@ComponentScan("com.video.controller")

//tell spring to inject any auto dependency's that are needed to be injected
// marked as @Automarked
@EnableAutoConfiguration

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
