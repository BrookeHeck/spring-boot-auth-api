package com.heck.auth.api.models.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlannerDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String avatarImgName;
}
