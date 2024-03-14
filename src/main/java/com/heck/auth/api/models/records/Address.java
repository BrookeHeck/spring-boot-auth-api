package com.heck.auth.api.models.records;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
}
