package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "event_id")
    private long id;

    @Column(name = "event_name")
    private String name;

    @Column(name = "date_of_event")
    private Date dateOfEvent;

    @Column(name = "event_person_count")
    private int personCount;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "event_location_street")),
            @AttributeOverride(name = "city", column = @Column(name = "event_location_city")),
            @AttributeOverride(name = "state", column = @Column(name = "event_location_state")),
            @AttributeOverride(name = "zipcode", column = @Column(name = "event_location_zipcode"))
    })
    private Address eventLocation;

    @Column(name = "event_description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "planner_id")
    private Planner eventOwner;
}
