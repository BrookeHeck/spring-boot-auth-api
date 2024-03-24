package com.heck.auth.api.models.dtos;

import lombok.Builder;

@Builder
public class AuthenticationResponse {
    private PlannerDto planner;
    private String jwt;
}
