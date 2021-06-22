package com.example.carwebapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class DBInitializer {
    @Autowired
    private CarRepository carRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationReady() {
        carRepository.saveAll(
                List.of(
                        new Car("Ford", "Mustang", 1984),
                        new Car("Porsche", "911", 1991)
                )
        );
    }
}
