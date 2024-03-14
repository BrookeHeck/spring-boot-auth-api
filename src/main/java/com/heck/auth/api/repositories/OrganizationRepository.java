package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
