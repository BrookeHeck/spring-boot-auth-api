package com.heck.auth.api.services;

import com.heck.auth.api.models.records.Planner;

import java.util.Set;

public interface PlannerService {
    Set<Planner> findContributorsForEventId(Long eventId);

    Planner findPlannerByEmail(String email);
}
