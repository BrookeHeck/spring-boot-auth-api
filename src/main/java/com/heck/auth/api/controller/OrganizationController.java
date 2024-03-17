package com.heck.auth.api.controller;

import com.heck.auth.api.models.records.Organization;
import com.heck.auth.api.services.implementations.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("organization")
public class OrganizationController {
    private final OrganizationService organizationService;

    @GetMapping(path = "get/{organizationId}")
    public Organization getOrganizationById(@PathVariable("organizationId") Long organizationId) {
        return organizationService.getOne(organizationId);
    }

    @GetMapping(path = "get-all")
    public Collection<Organization> getAllOrganizations() {
        return organizationService.getAll();
    }

    @PostMapping(path = "create")
    public Organization createOrganization(@RequestBody Organization organization) {
        return organizationService.create(organization);
    }

    @PutMapping(path = "update")
    public Organization updateOrganization(@RequestBody Organization organization) {
        return organizationService.create(organization);
    }

    
}
