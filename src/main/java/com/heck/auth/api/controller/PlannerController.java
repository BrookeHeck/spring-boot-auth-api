package com.heck.auth.api.controller;

import com.heck.auth.api.models.dtos.AuthenticationResponse;
import com.heck.auth.api.models.dtos.PlannerDto;
import com.heck.auth.api.models.records.Planner;
import com.heck.auth.api.security.AuthenticationService;
import com.heck.auth.api.services.implementations.EventServiceImpl;
import com.heck.auth.api.services.implementations.PlannerServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("/planner")
public class PlannerController {
    private final PlannerServiceImpl plannerService;
    private final AuthenticationService authenticationService;
    private final ModelMapper mapper;

    @PostMapping(path = "/register")
    public AuthenticationResponse register(@RequestBody PlannerDto plannerDto, HttpServletRequest request) {
        String basicAuthHeader = request.getHeader(HttpServletRequest.BASIC_AUTH);
        return authenticationService.register(plannerDto, basicAuthHeader);
    }

    @GetMapping(path = "/login")
    public AuthenticationResponse login(HttpServletRequest request) {
        String basicAuthHeader = request.getHeader(HttpServletRequest.BASIC_AUTH);
        return authenticationService.authenticate(basicAuthHeader);
    }

    @GetMapping(path = "/get/{plannerId}")
    public PlannerDto getPlanner(@PathVariable("plannerId") Long plannerId) {
        return mapper.map(plannerService.getOne(plannerId), PlannerDto.class);
    }

    @GetMapping(path = "/get-all")
    public Collection<Planner> getPlannersForEvent() {
        return plannerService.getAll();
    }

    @GetMapping(path = "/get-event-contributors/{eventId}")
    public Collection<Planner> getEventContributors(@PathVariable("eventId") Long eventId) {
        return plannerService.findContributorsForEventId(eventId);
    }

    @PostMapping(path = "/create")
    public Planner createPlanner(@RequestBody Planner planner) {
        return plannerService.create(planner);
    }

    @PostMapping(path = "/update")
    public Planner updatePlanner(@RequestBody Planner planner) {
        return plannerService.update(planner);
    }

    @DeleteMapping(path = "/delete/{plannerId}")
    public boolean deletePlanner(@PathVariable("plannerId") Long plannerId) {
        return plannerService.delete(plannerId);
    }
}
