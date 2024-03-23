package com.heck.auth.api.security;

import com.heck.auth.api.services.PlannerService;
import com.heck.auth.api.services.implementations.PlannerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final PasswordEncoder passwordEncoder;
    private final PlannerService plannerService;
}
