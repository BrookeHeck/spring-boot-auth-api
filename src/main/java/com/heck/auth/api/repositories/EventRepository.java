package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.Event;
import com.heck.auth.api.models.records.Planner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
}
