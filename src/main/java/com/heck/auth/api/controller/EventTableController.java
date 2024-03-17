package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.EventTable;
import com.heck.auth.api.services.implementations.EventTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("event-table")
public class EventTableController {
    private final EventTableService eventTableService;

    @GetMapping(path = "get/{eventTableId}")
    public EventTable getEventTableById(@PathVariable("eventTableId") Long eventTableId) {
        return eventTableService.getOne(eventTableId);
    }

    @GetMapping(path = "get-all")
    public Collection<EventTable> getEventTables() {
        return eventTableService.getAll();
    }
}
