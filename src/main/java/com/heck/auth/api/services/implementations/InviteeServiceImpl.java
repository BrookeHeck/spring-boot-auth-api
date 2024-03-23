package com.heck.auth.api.services.implementations;

import com.heck.auth.api.models.records.Invitee;
import com.heck.auth.api.repositories.InviteeRepository;
import com.heck.auth.api.services.CrudService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Transactional
@RequiredArgsConstructor
public class InviteeServiceImpl implements CrudService<Invitee> {
    private final InviteeRepository inviteeRepository;

    @Override
    public Invitee create(Invitee record) {
        return inviteeRepository.save(record);
    }

    @Override
    public Collection<Invitee> getAll() {
        return inviteeRepository.findAll();
    }

    @Override
    public Invitee getOne(long id) {
        return inviteeRepository.findById(id).get();
    }

    @Override
    public Invitee update(Invitee record) {
        return inviteeRepository.save(record);
    }

    @Override
    public boolean delete(long id) {
        inviteeRepository.deleteById(id);
        return true;
    }
}
