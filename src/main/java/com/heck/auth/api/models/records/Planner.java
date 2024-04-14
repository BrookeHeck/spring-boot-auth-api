package com.heck.auth.api.models.records;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.heck.auth.api.models.enums.PLANNER_ACCOUNT_STATUS;
import com.heck.auth.api.models.query.EventContributorsData;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
public class Planner implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "planner_id")
    private long id;

    @Column(name = "planner_first_name")
    private String firstName;

    @Column(name = "planner_last_name")
    private String lastName;

    @Column(name = "planner_email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "avatar_img_name")
    private String avatarImgName;

    @OneToMany(mappedBy = "eventOwner")
    private Set<Event> eventsOwned;

    @ManyToMany(mappedBy = "contributors")
    private Set<Event> eventsContributed;

    @Column(name = "planner_account_status")
    PLANNER_ACCOUNT_STATUS accountStatus;

    @Column(name = "last_login_date")
    LocalDate lastLoginDate;

    @Column(name = "last_password_update")
    LocalDate lastPasswordDate;

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

    @Override
    public java.util.Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountStatus != PLANNER_ACCOUNT_STATUS.INACTIVE_60_DAYS;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountStatus != PLANNER_ACCOUNT_STATUS.INACTIVE_ADMIN_LOCK;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        LocalDate sixMonthsAgo = LocalDate.now().minusMonths(6);
        return lastPasswordDate.isAfter(sixMonthsAgo);
    }

    @Override
    public boolean isEnabled() {
        return accountStatus == PLANNER_ACCOUNT_STATUS.ACTIVE;
    }
}
