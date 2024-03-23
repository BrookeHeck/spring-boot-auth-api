package com.heck.auth.api.models.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventContributorsData {
    private Long plannerId;
    private String firstName;
    private String lastName;
    private String avatarImgName;
}
