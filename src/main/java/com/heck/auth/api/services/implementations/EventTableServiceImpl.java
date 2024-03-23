package com.heck.auth.api.services.implementations;

import com.heck.auth.api.models.records.EventTable;
import com.heck.auth.api.repositories.EventTableRepository;
import com.heck.auth.api.services.CrudService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Transactional
@RequiredArgsConstructor
public class EventTableServiceImpl implements CrudService<EventTable> {

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
