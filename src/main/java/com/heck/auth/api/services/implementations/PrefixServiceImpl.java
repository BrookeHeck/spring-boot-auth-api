package com.heck.auth.api.services.implementations;

import com.heck.auth.api.models.records.Prefix;
import com.heck.auth.api.repositories.PrefixRepository;
import com.heck.auth.api.services.CrudService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Transactional
@RequiredArgsConstructor
public class PrefixServiceImpl implements CrudService<Prefix> {
    private final PrefixRepository prefixRepository;

    @Override
    public Prefix create(Prefix record) {
        return prefixRepository.save(record);
    }

    @Override
    public Collection<Prefix> getAll() {
        return prefixRepository.findAll();
    }

    @Override
    public Prefix getOne(long id) {
        return prefixRepository.findById(id).get();
    }

    @Override
    public Prefix update(Prefix record) {
        return prefixRepository.save(record);
    }

    @Override
    public boolean delete(long id) {
        prefixRepository.deleteById(id);
        return true;
    }
}
