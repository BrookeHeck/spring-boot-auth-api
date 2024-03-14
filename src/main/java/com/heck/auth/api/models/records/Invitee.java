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

    @ManyToOne
    @JoinColumn(name = "INVITEE_PREFIX")
    private Prefix prefix;

    @ManyToOne
    @JoinColumn(name = "GUEST_INVITED_BY")
    private Guest guestInvitedBy;

    @ManyToOne
    @JoinColumn(name = "INVITEE_ASSIGNED_TABLE")
    private EventTable assignedEventTable;

}
