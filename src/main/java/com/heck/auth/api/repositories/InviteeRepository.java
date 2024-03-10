package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.Invitee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InviteeRepository extends JpaRepository<Invitee, Long> {
}
