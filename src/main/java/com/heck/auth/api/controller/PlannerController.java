package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.Planner;
import com.heck.auth.api.services.implementations.PlannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

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

    @PostMapping(path = "create")
    public Planner createPlanner(@RequestBody Planner planner) {
        return plannerService.create(planner);
    }

    @PostMapping(path = "update")
    public Planner updatePlanner(@RequestBody Planner planner) {
        return plannerService.update(planner);
    }
}
