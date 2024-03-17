package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.Guest;
import com.heck.auth.api.services.implementations.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("guest")
public class GuestController {
    private final GuestService guestService;

    @GetMapping(path = "get/{guestId}")
    public Guest getGuestById(@PathVariable("guestId") Long guestId) {
        return guestService.getOne(guestId);
    }

    @GetMapping(path = "get-all")
    public Collection<Guest> getAllGuests() {
        return guestService.getAll();
    }
    
}
