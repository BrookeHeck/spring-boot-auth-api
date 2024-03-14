package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "organization_id")
    private long id;

    @Column(name = "organization_name")
    private String organizationName;

    @ManyToOne
    @JoinColumn(name = "planner_id")
    private User organizationCreator;

//    @ManyToMany(fetch = FetchType.LAZY)
//    private Set<Prefix> prefixes;

}
