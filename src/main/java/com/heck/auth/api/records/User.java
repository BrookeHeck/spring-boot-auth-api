package com.heck.auth.api.records;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
