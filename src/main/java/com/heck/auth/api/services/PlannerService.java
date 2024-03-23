package com.heck.auth.api.services;

import com.heck.auth.api.models.records.Planner;

import java.util.Optional;
import java.util.Set;

public interface PlannerService {
    Set<Planner> findContributorsForEventId(Long eventId);

    Optional<Planner> findPlannerByEmail(String email);
}
