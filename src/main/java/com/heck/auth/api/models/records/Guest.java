package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "GUEST")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GUEST_ID")
    private long id;

    @Column(name = "GUEST_FIRST_NAME")
    private String firstName;

    @Column(name = "GUEST_LAST_NAME")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "GUEST_PREFIX")
    private Prefix prefix;

    @ManyToOne
    @JoinColumn(name = "GUEST_ORGANIZATION")
    private Organization organization;

    @Column(name = "GUEST_PHONE")
    private String phone;

    @Column(name = "GEUST_EMAIL")
    private String email;

    @Column(name = "CONFIRMATION")
    private boolean confirmed;

    @ManyToOne
    @JoinColumn(name = "GUEST_ASSIGNED_TABLE_ID")
    private EventTable assignedEventTable;


//    @OneToMany(mappedBy = "guest")
//    private Set<Invitee> invitees;
//    @ManyToOne
//    @JoinColumn(name = "event_id")
//    private Event event;

}
