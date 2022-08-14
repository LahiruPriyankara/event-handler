package com.lhu.eventhandler.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;


@Getter
public class Event<T> extends ApplicationEvent {
    private final T data;

    public Event(T data) {
        super(data);
        this.data = data;
    }
}
