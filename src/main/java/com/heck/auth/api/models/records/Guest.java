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
    private long guestId;

    private String firstName;
    private String lastName;
    private String prefix;
    @ManyToOne
    private Organization organization;
    private String phone;
    private String email;
    private boolean confirmed;
    @OneToMany(mappedBy = "guest_id")
    private Set<Invitee> invitees;

}
