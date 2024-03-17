package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "planner")
public class Planner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "planner_id")
    private long id;

    @Column(name = "planner_first_name")
    private String firstName;

    @Column(name = "planner_last_name")
    private String lastName;

    @Column(name = "planner_email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "avatar_img_name")
    private String avatarImgName;

}
