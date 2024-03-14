package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "INVITEE")
public class Invitee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INVITEE_ID")
    private long id;

    @Column(name = "INVITEE_FIRST_NAME")
    private String firstName;

    @Column(name = "INVITEE_LAST_NAME")
    private String lastName;

    @Column(name = "INVITEE_PREFIX")
    @ManyToOne
    @JoinColumn(name = "PREFIX_ID")
    private Prefix prefix;

    @Column(name = "GUEST_INVITED_BY")
    @ManyToOne
    @JoinColumn(name = "GUEST_ID")
    private Guest guestInvitedBy;

    @Column(name = "INVITEE_ASSIGNED_TABLE")
    @ManyToOne
    private EventTable assignedEventTable;

}
