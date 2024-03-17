package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.Event;
import com.heck.auth.api.models.records.Planner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface PlannerRepository extends JpaRepository<Planner, Long> {

    List<Planner> findPlannersByEventsContributedIn(Long eventId);
}
