package com.heck.auth.api.services.implementations;

import com.heck.auth.api.models.records.Guest;
import com.heck.auth.api.repositories.GuestRepository;
import com.heck.auth.api.services.DatabaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class GuestService implements DatabaseService<Guest> {
    private final GuestRepository guestRepository;

    @Override
    public Guest create(Guest record) {
        return guestRepository.save(record);
    }

    @Override
    public Collection<Guest> getAll() {
        return guestRepository.findAll();
    }

    @Override
    public Guest getOne(long id) {
        return guestRepository.findById(id).get();
    }

    @Override
    public Guest update(Guest record) {
        return guestRepository.save(record);
    }

    @Override
    public boolean delete(long id) {
        guestRepository.deleteById(id);
        return true;
    }
}
