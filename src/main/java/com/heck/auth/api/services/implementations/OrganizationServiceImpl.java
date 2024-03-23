package com.heck.auth.api.services.implementations;

import com.heck.auth.api.models.records.Organization;
import com.heck.auth.api.repositories.OrganizationRepository;
import com.heck.auth.api.services.CrudService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Transactional
@RequiredArgsConstructor
public class OrganizationServiceImpl implements CrudService<Organization> {
    private final OrganizationRepository organizationRepository;

    @Override
    public Organization create(Organization record) {
        return organizationRepository.save(record);
    }

    @Override
    public Collection<Organization> getAll() {
        return organizationRepository.findAll();
    }

    @Override
    public Organization getOne(long id) {
        return organizationRepository.findById(id).get();
    }

    @Override
    public Organization update(Organization record) {
        return organizationRepository.save(record);
    }

    @Override
    public boolean delete(long id) {
        organizationRepository.deleteById(id);
        return true;
    }
}
