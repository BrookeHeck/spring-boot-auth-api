package com.heck.auth.api.services.implementations;

import com.heck.auth.api.models.records.Event;
import com.heck.auth.api.repositories.EventRepository;
import com.heck.auth.api.services.CrudService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Transactional
@Service
public class EventServiceImpl implements CrudService<Event> {
    private final EventRepository eventRepo;
    @Override
    public Event create(Event record) {
        return eventRepo.save(record);
    }

    @Override
    public Collection<Event> getAll() {
        return eventRepo.findAll();
    }

    @Override
    public Event getOne(long id) {
        return eventRepo.findById(id).get();
    }

    @Override
    public Event update(Event record) {
        return eventRepo.save(record);
    }

    @Override
    public boolean delete(long id) {
        eventRepo.deleteById(id);
        return true;
    }
}
