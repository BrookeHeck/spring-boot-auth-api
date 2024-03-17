package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.Event;
import com.heck.auth.api.services.implementations.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("event")
public class EventController {
    private final EventService eventService;

    @GetMapping(path = "get/{eventId}")
    public Event getEventById(@PathVariable("eventId") Long eventId) {
        return eventService.getOne(eventId);
    }

    @GetMapping(path = "get-all")
    public Collection<Event> getEvents() {
        return eventService.getAll();
    }

    
}
