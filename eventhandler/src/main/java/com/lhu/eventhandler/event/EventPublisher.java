package com.lhu.eventhandler.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(String message) {

        applicationEventPublisher.publishEvent(new Event(DataModel.builder().name(message).build()));
    }
}

