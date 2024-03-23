package com.heck.auth.api.models.records;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.heck.auth.api.models.query.EventContributorsData;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "planner")
//@SqlResultSetMappings({
//        @SqlResultSetMapping(
//                name="eventContributorsData",
//                classes = @ConstructorResult(
//                        targetClass = EventContributorsData.class,
//                        columns = {@ColumnResult(name = "planner_id", type = Long.class), @ColumnResult(name = "planner_first_name", type = String.class),
//                        @ColumnResult(name = "planner_last_name", type = String.class), @ColumnResult(name = "avatar_img_name", type = String.class)}
//                )
//        )
//})
//@NamedNativeQueries(
//        @NamedNativeQuery(name = "Planner.getContributorsForEvent",
//                query = "select p.planner_id, p.planner_first_name, p.planner_last_name, p.avatar_img_name from planner p " +
//                        "join event_contributors e on p.planner_id = e.planner_id where e.event_id = :EVENT_ID",
//                resultSetMapping = "eventContributorsData")
//)
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

    @OneToMany(mappedBy = "eventOwner")
    private Set<Event> eventsOwned;

    @ManyToMany(mappedBy = "contributors")
    private Set<Event> eventsContributed;

    @Override
    public String toString() {
        return "Planner " + id + ": " + firstName + " " + lastName;
    }

    @JsonIgnore
    public Set<Event> getEventsOwned() {
        return eventsOwned;
    }

    @JsonIgnore
    public Set<Event> getEventsContributed() {
        return eventsContributed;
    }
}
