package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.EventTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTableRepository extends JpaRepository<EventTable, Long> {
}
