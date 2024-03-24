package com.heck.auth.api.security;

import com.heck.auth.api.models.dtos.AuthenticationResponse;
import com.heck.auth.api.models.records.Planner;
import com.heck.auth.api.services.implementations.PlannerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final PasswordEncoder passwordEncoder;
    private final PlannerServiceImpl plannerService;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

}
