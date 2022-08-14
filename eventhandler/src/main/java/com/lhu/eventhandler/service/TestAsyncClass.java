package com.lhu.eventhandler.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class TestAsyncClass {

    @Async
    public void testAsyncCall(){
        try {for(int i=0;i<3;i++){
                System.out.println("Async Call.."+i);
                Thread.sleep(5000);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
