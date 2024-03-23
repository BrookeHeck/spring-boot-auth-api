package com.heck.auth.api.services.implementations;

import com.heck.auth.api.models.query.EventContributorsData;
import com.heck.auth.api.models.records.Event;
import com.heck.auth.api.models.records.Planner;
import com.heck.auth.api.repositories.PlannerRepository;
import com.heck.auth.api.services.DatabaseService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class PlannerService implements DatabaseService<Planner> {
    private final PlannerRepository plannerRepository;
    private final EventService eventService;

    @Override
    public Planner create(Planner record) {
        return plannerRepository.save(record);
    }

    @Override
    public List<Planner> getAll() {
        return plannerRepository.findAll();
    }

    @Override
    public Planner getOne(long id) {
        return plannerRepository.findById(id).get();
    }

    @Override
    public Planner update(Planner record) {
        return plannerRepository.save(record);
    }

    @Override
    public boolean delete(long id) {
        plannerRepository.deleteById(id);
        return true;
    }

    public Set<Planner> findContributorsForEventId(Long eventId) {
        try {
            Event event = eventService.getOne(eventId);
            if(event == null) throw new NullPointerException("Event with event id + " + eventId + "is null");
            return event.getContributors();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());;
            return new HashSet<>();
        }
    }
}
