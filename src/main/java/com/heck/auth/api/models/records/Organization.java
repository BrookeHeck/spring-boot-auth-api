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
@Table(name = "ORGANIZATION")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORGANIZATION_ID")
    private long id;

    @Column(name = "ORGANIZATION_NAME")
    private String organizationName;

    @Column(name = "ORGANIZATION_CREATOR")
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User organizationCreator;

//    @ManyToMany(fetch = FetchType.LAZY)
//    private Set<Prefix> prefixes;

}
