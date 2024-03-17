package com.heck.auth.api.models.records;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "prefix")
public class Prefix {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "prefix_id")
    private long id;

    @Column(name = "prefix_display")
    private String prefixDisplay;

}
