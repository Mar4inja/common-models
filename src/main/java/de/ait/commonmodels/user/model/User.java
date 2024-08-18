package de.ait.usermanagment.model;

import de.ait.commonmodels.user.model.Role;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String password;
    private String phoneNumber;
    private String country;
    private String postIndex;
    private String city;
    private String street;
    private Set<Role> roles = new HashSet<>();
    private boolean isActive;
    private LocalDateTime registrationDate;

    // Default constructor is automatically provided by @Data
    // All-arguments constructor is automatically provided by @Data
}
