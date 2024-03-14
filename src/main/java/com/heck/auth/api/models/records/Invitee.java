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
@Table(name = "invitee")
public class Invitee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invitee_id")
    private long id;

    @Column(name = "invitee_first_name")
    private String firstName;

    @Column(name = "invitee_last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "prefix_id")
    private Prefix prefix;

    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guestInvitedBy;

    @ManyToOne
    @JoinColumn(name = "event_table_id")
    private EventTable assignedEventTable;

}
