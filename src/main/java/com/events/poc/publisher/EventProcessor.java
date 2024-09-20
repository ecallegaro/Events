package com.events.poc.publisher;

import com.events.poc.myevent.MyEvent;
import com.events.poc.myevent.MyEventPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EventProcessor {
    @Autowired
    private EventPublisher publisher;
    public void process() {
        for (int x = 0; x < 10; x++) {
            MyEventPayload payload = new MyEventPayload();
            payload.setId(UUID.randomUUID().toString());
            payload.setValue(10);
            MyEvent event = new MyEvent(this, payload);
            publisher.publish(event);
        }
    }
}
