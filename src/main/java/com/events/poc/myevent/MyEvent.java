package com.events.poc.myevent;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    private static final long serialVersionUID = -2680668406815551230L;
    private MyEventPayload payload;
    public MyEvent(Object source, MyEventPayload payload) {
        super(source);
        this.payload = payload;
    }
    public MyEventPayload getPayload() {
        return this.payload;
    }
}
