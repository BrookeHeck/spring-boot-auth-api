package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
