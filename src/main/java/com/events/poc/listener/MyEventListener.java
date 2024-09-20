package com.events.poc.listener;

import com.events.poc.myevent.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyEventListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        try {
            System.out.println("Inicio: processando my listener do evento: ");
            Thread.sleep(event.getPayload().getValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fim: my listener: "+event.getPayload().getId() + ":" + new Date());
    }
}
