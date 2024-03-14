package com.heck.auth.api.services.implementations;

import com.heck.auth.api.models.records.EventTable;
import com.heck.auth.api.repositories.EventTableRepository;
import com.heck.auth.api.services.DatabaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class EventTableService implements DatabaseService<EventTable> {

    private final EventTableRepository eventTableRepository;

    @Override
    public EventTable create(EventTable record) {
        return eventTableRepository.save(record);
    }

    @Override
    public Collection<EventTable> getAll() {
        return eventTableRepository.findAll();
    }

    @Override
    public EventTable getOne(long id) {
        return eventTableRepository.findById(id).get();
    }

    @Override
    public EventTable update(EventTable record) {
        return eventTableRepository.save(record);
    }

    @Override
    public boolean delete(long id) {
        eventTableRepository.deleteById(id);
        return true;
    }
}
