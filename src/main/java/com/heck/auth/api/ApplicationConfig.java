package com.heck.auth.api;

import com.heck.auth.api.services.implementations.PlannerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
    private final PlannerServiceImpl plannerService;

//    @Bean
//    public UserDetailsService userDetailsService() {
//        return email -> plannerService.findPlannerByEmail(email)
//                .orElseThrow(() -> new UsernameNotFoundException("planner not found"));
//    }
}
