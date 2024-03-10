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
    private long id;

    private String prefixDisplay;
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Organization> organization;

}
