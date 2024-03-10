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
public class Prefix {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long prefixId;

    private String prefixDisplay;
    @ManyToMany
    private Set<Organization> organization;

}
