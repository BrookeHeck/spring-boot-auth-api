package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;

    private String name;
    private int personCount;
    @Embedded
    private Address address;
    private String description;
    @OneToOne
    private User eventOwners;
    @OneToMany
    private Set<User> collaborators;

}
