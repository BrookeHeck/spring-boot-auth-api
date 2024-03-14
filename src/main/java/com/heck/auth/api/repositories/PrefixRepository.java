package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.Prefix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrefixRepository extends JpaRepository<Prefix, Long> {
}
