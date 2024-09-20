package com.events;

import com.events.poc.publisher.EventProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Date;

@SpringBootApplication
@EnableAsync
public class EventsApplication implements CommandLineRunner {
    @Autowired
    private EventProcessor processor;

    public static void main(String[] args) {
        SpringApplication.run(EventsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inicio: "+new Date());
        processor.process();
        System.out.println("Fim: " +new Date());
    }
}
