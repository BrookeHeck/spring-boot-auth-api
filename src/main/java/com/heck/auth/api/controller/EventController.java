package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.Event;
import com.heck.auth.api.services.implementations.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "create")
    public Event createEvent(@RequestBody Event event) {
        return eventService.create(event);
    }

    @PutMapping(path = "update")
    public Event updateEvent(@RequestBody Event event) {
        return eventService.update(event);
    }

    @DeleteMapping(path = "delete/{eventId}")
    public boolean deleteEvent(@PathVariable("eventId") Long eventId) {
        return eventService.delete(eventId);
    }
}
