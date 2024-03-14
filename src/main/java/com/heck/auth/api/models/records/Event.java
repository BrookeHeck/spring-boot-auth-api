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
@Table(name = "EVENT")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EVENT_ID")
    private long id;

    @Column(name = "EVENT_NAME")
    private String name;

    @Column(name = "DATE_OF_EVENT")
    private Date dateOfEvent;

    @Column(name = "EVENT_PERSON_COUNT")
    private int personCount;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "EVENT_STREET")),
            @AttributeOverride(name = "city", column = @Column(name = "EVENT_CITY")),
            @AttributeOverride(name = "state", column = @Column(name = "EVENT_STATE")),
            @AttributeOverride(name = "zipcode", column = @Column(name = "EVENT_ZIPCODE"))
    })
    private Address address;

    @Column(name = "EVENT_DESCRIPTION")
    private String description;

    @ManyToOne
    @JoinColumn(name = "EVENT_OWNER_USER")
    private User eventOwner;



//    @ManyToMany
//    private Set<User> collaborators;
//    @OneToMany(mappedBy = "event")
//    private Set<Table> tables;
//    @OneToMany(mappedBy = "event")
//    private Set<Guest> guests;
}
