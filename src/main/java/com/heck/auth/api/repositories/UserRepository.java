package com.heck.auth.api.repositories;

import com.heck.auth.api.models.records.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
