package com.lhu.eventhandler.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {

    @EventListener
    @Async
    public void handleEvent(Event auditEvent) {
        try {
            //String data = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(auditEvent.getData());
            for(int i=0;i<3;i++){
                System.out.println("[Handling the event] - " + ((DataModel)auditEvent.getData()).getName());
                Thread.sleep(5000);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
