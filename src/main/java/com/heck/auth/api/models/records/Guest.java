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

    @Column(name = "GUEST_PREFIX")
    @ManyToOne
    @JoinColumn(name = "PREFIX_ID")
    private Prefix prefix;

    @Column(name = "GUEST_ORGANIZATION")
    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    @Column(name = "GUEST_PHONE")
    private String phone;

    @Column(name = "GEUST_EMAIL")
    private String email;

    @Column(name = "CONFIRMATION")
    private boolean confirmed;

    @Column(name = "GUEST_ASSIGNED_TABLE")
    @ManyToOne
    private EventTable assignedEventTable;


//    @OneToMany(mappedBy = "guest")
//    private Set<Invitee> invitees;
//    @ManyToOne
//    @JoinColumn(name = "event_id")
//    private Event event;

}
