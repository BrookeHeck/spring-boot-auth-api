package com.heck.auth.api.services.implementations;

import com.heck.auth.api.models.records.Planner;
import com.heck.auth.api.repositories.PlannerRepository;
import com.heck.auth.api.services.DatabaseService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Transactional
@RequiredArgsConstructor
public class PlannerService implements DatabaseService<Planner> {
    private final PlannerRepository plannerRepository;

    @Override
    public Planner create(Planner record) {
        return plannerRepository.save(record);
    }

    @Override
    public Collection<Planner> getAll() {
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
}
