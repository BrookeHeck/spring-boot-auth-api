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
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tableId;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
    private int maxNumberOfPeople;
    private int xLocation;
    private int yLocation;
    @OneToMany(mappedBy = "table_id")
    private Set<Guest> guests;
    @OneToMany(mappedBy = "table_id")
    private Set<Invitee> invitees;
}
