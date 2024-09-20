package com.events.poc.listener;

import com.events.poc.myevent.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Async
public class AssyncEventListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        try {
            System.out.println("Inicio: Processando assync listener do evento: ");
            Thread.sleep(event.getPayload().getValue() * 10);
            System.out.println("Fim: assync listener: "+event.getPayload().getId() + ":" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
