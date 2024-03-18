package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.Planner;
import com.heck.auth.api.services.implementations.PlannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("planner")
public class PlannerController {
    private final PlannerService plannerService;

    @GetMapping(path = "get/{plannerId}")
    public Planner getPlanner(@PathVariable("plannerId") Long plannerId) {
        return plannerService.getOne(plannerId);
    }

    @GetMapping(path = "get-all")
    public Collection<Planner> getPlannersForEvent() {
        return plannerService.getAll();
    }

    @GetMapping(path = "get-event-contributors/{eventId}")
    public Collection<Planner> getEventContributors(@PathVariable("eventId") Long eventId) {
        return plannerService.findContributorsForEventId(eventId);
    }

    @PostMapping(path = "create")
    public Planner createPlanner(@RequestBody Planner planner) {
        return plannerService.create(planner);
    }

    @PostMapping(path = "update")
    public Planner updatePlanner(@RequestBody Planner planner) {
        return plannerService.update(planner);
    }

    @DeleteMapping(path = "delete/{plannerId}")
    public boolean deletePlanner(@PathVariable("plannerId") Long plannerId) {
        return plannerService.delete(plannerId);
    }
}
