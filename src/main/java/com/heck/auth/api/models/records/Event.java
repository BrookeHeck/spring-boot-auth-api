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
    private long eventId;

    private String name;
    private int personCount;
    @Embedded
    private Address address;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User eventOwner;
    @ManyToMany
    private Set<User> collaborators;

    // could add another @ManyToMany annotation for Guests when that record is created
}
