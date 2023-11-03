package org.example;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class MyService {

    @ConfigProperty(name = "greetings.message")
    String message;

    public Greeting getMessage(String name) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message + name);
        return greeting;
    }
}
