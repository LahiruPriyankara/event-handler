package com.lhu.eventhandler.controller;

import com.lhu.eventhandler.service.EventHandleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/event")
public class EventHandleController {

    @Autowired
    private EventHandleService eventHandleService;

    @GetMapping("/testEventHandle")
    public ResponseEntity<String> testEventHandle(){
        eventHandleService.testEventHandle();
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/testAsync")
    public ResponseEntity<String> testAsyncCall(){
        eventHandleService.testAsyncCall();
        return ResponseEntity.ok("OK");
    }
}
