package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "EVENT_TABLE")
public class EventTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TABLE_ID")
    private long id;

    @Column(name = "TABLE_EVENT_ID")
    @ManyToOne
    @JoinColumn(name = "EVENT_ID")
    private Event event;

    @Column(name = "MAX_NUMBER_PEOPLE")
    private int maxNumberOfPeople;

    @Column(name = "X_LOCATION")
    private int xLocation;

    @Column(name = "Y_LOCATION")
    private int yLocation;

//
//    @OneToMany(mappedBy = "table")
//    private Set<Guest> guests;
//    @OneToMany(mappedBy = "table")
//    private Set<Invitee> invitees;
}
