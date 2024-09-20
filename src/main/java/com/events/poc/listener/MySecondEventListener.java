package com.events.poc.listener;

import com.events.poc.myevent.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MySecondEventListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("Inicio: processando segundo listener do evento: ");
        try {
            Thread.sleep(event.getPayload().getValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fim: second listener: "+event.getPayload().getId() + ":" + new Date());
    }
}
