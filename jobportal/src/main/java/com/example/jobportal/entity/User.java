package com.example.jobportal.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    private String userName;
    private String email;
    @Column(nullable = false)
    private String password;

    @ManyToMany
    @JoinTable(
            name = "UserJobs",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "job_id")
    )
    private Set<Jobs> job = new LinkedHashSet<>();

}
