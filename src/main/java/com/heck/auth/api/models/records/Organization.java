package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long organizationId;

    private String displayString;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User organizationCreator;
    @ManyToMany
    private Set<Prefix> prefixes;

}