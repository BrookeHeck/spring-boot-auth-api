package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "PREFIX")
public class Prefix {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PREFIX_ID")
    private long id;

    @Column(name = "PREFIX_DISPLAY")
    private String prefixDisplay;

//
//    @ManyToMany(fetch = FetchType.LAZY)
//    private Set<Organization> organization;

}
