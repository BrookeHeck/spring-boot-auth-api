package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.Invitee;
import com.heck.auth.api.services.implementations.InviteeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("invitee")
public class InviteeController {
    private final InviteeService inviteeService;

    @GetMapping(path = "get/{inviteeId}")
    public Invitee getInviteeById(@PathVariable("inviteeId") Long inviteeId) {
        return inviteeService.getOne(inviteeId);
    }

    @GetMapping(path = "get-all")
    public Collection<Invitee> getAllInvitees() {
        return inviteeService.getAll();
    }

    
}
