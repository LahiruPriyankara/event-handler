package com.lhu.eventhandler.service;

import com.lhu.eventhandler.event.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventHandleService {
    @Autowired
    private EventPublisher eventPublisher;

    @Autowired
    private TestAsyncClass testAsyncClass;

    public void testEventHandle(){
        eventPublisher.publishEvent("Handled !");
    }

    public void testAsyncCall(){
        testAsyncClass.testAsyncCall();
    }
}
