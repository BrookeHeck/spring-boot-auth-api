package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private Date dateOfEvent;
    private int personCount;
    @Embedded
    private Address address;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User eventOwner;
//    @ManyToMany
//    private Set<User> collaborators;
//    @OneToMany(mappedBy = "event")
//    private Set<Table> tables;
//    @OneToMany(mappedBy = "event")
//    private Set<Guest> guests;
}
