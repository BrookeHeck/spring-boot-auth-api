package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.EventTable;
import com.heck.auth.api.services.implementations.EventTableServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("event-table")
public class EventTableController {
    private final EventTableServiceImpl eventTableServiceImpl;

    @GetMapping(path = "get/{eventTableId}")
    public EventTable getEventTableById(@PathVariable("eventTableId") Long eventTableId) {
        return eventTableServiceImpl.getOne(eventTableId);
    }

    @GetMapping(path = "get-all")
    public Collection<EventTable> getEventTables() {
        return eventTableServiceImpl.getAll();
    }

    @PostMapping(path = "create")
    public EventTable createEventTable(@RequestBody EventTable eventTable) {
        return eventTableServiceImpl.create(eventTable);
    }

    @PutMapping(path = "update")
    public EventTable updateEventTable(@RequestBody EventTable eventTable) {
        return eventTableServiceImpl.update(eventTable);
    }

    @DeleteMapping(path = "delete/{eventTableId}")
    public boolean deleteEventTable(@PathVariable("eventTableId") Long eventTableId) {
        return eventTableServiceImpl.delete(eventTableId);
    }
}
