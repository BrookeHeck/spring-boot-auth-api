package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
