package com.heck.auth.api.models.dtos;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AuthenticationResponse {
    private PlannerDto planner;
    private String jwt;
}
