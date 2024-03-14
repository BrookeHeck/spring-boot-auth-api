package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "event_table")
public class EventTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "event_table_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event attachedEevent;

    @Column(name = "max_number_of_people")
    private int maxNumberOfPeople;

    @Column(name = "x_location")
    private int xLocation;

    @Column(name = "y_location")
    private int yLocation;

//
//    @OneToMany(mappedBy = "table")
//    private Set<Guest> guests;
//    @OneToMany(mappedBy = "table")
//    private Set<Invitee> invitees;
}
