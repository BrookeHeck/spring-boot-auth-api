package com.heck.auth.api.security;

import com.heck.auth.api.models.dtos.AuthenticationResponse;
import com.heck.auth.api.models.dtos.PlannerDto;
import com.heck.auth.api.models.records.Planner;
import com.heck.auth.api.services.implementations.PlannerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final PasswordEncoder passwordEncoder;
    private final PlannerServiceImpl plannerService;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final ModelMapper mapper;

    public AuthenticationResponse authenticate(String basicAuthHeader) {
        String decodedHeader = decodeBase65BasicAuth(basicAuthHeader);
        String[] usernameAndPassword = extractUserNameAndPassword(decodedHeader).split(":");
        String username = usernameAndPassword[0];
        String password = usernameAndPassword[1];
        authenticateUserByEmailAndPassword(username, password);
        Planner planner = findPlannerAfterAuthenticated(username);
        return AuthenticationResponse.builder()
                .planner(mapper.map(planner, PlannerDto.class))
                .jwt(jwtService.generateToken(planner)).build();
    }

    private String decodeBase65BasicAuth(String basicAuthHeader) {
        byte[] decodedBytes = Base64.getDecoder().decode(basicAuthHeader);
        return new String(decodedBytes, StandardCharsets.UTF_8);
    }

    private String extractUserNameAndPassword(String decodedBasicAuth) {
        return decodedBasicAuth.split(" ")[1];
    }


    private void authenticateUserByEmailAndPassword(String username, String password) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
    }

    private Planner findPlannerAfterAuthenticated(String email) {
        return plannerService.findPlannerByEmail(email).orElseThrow();
    }

}
