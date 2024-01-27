package com.heck.auth.api.records;

import com.heck.auth.api.ROLE;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String firstName;
    private ROLE role;

    public Employee(Integer id, String lastName, String firstName, ROLE role) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee "  + id + ": " + lastName + ", " + firstName + " : Position: " + role;
    }
}
