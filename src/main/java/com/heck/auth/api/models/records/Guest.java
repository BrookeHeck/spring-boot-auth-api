package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "guest_id")
    private long id;

    @Column(name = "guest_first_name")
    private String firstName;

    @Column(name = "guest_last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "prefix_id")
    private Prefix prefix;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Column(name = "guest_phone")
    private String phone;

    @Column(name = "guest_email")
    private String email;

    @Column(name = "attendance_confirmed")
    private boolean attendanceConfirmed;

    @ManyToOne
    @JoinColumn(name = "event_table_id")
    private EventTable assignedEventTable;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "guestInvitedBy")
    private Set<Invitee> invitees;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
