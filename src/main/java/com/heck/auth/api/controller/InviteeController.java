package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.Invitee;
import com.heck.auth.api.services.implementations.InviteeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "create")
    public Invitee createInvitee(@RequestBody Invitee invitee) {
        return inviteeService.create(invitee);
    }

    @PutMapping(path = "update")
    public Invitee updateInvitee(@RequestBody Invitee invitee) {
        return inviteeService.update(invitee);
    }

    @DeleteMapping(path = "delete/{inviteeId}")
    public boolean deleteInvitee(@PathVariable("inviteeId") Long inviteeId) {
        return inviteeService.delete(inviteeId);
    }
}
