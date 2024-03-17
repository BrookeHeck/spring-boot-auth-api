package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.Guest;
import com.heck.auth.api.services.implementations.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "create")
    public Guest createGuest(@RequestBody Guest guest) {
        return guestService.create(guest);
    }

    @PutMapping(path = "update")
    public Guest updateGuest(@RequestBody Guest guest) {
        return guestService.update(guest);
    }
}
