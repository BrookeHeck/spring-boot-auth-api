package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.Planner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlannerRepository extends JpaRepository<Planner, Long> {
}
