package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Invitee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private String prefix;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest;

}
