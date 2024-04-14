package com.heck.auth.api.models.dtos;

import com.heck.auth.api.models.enums.PLANNER_ACCOUNT_STATUS;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class PlannerDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String avatarImgName;
    private PLANNER_ACCOUNT_STATUS accountStatus;
    private LocalDate lastLoginDate;
    private String jwt;
}
