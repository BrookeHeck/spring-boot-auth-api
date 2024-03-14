package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
