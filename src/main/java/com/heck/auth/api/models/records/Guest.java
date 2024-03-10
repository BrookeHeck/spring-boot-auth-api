package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String prefix;
    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
    private String phone;
    private String email;
    private boolean confirmed;
    @OneToMany(mappedBy = "guest")
    private Set<Invitee> invitees;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
