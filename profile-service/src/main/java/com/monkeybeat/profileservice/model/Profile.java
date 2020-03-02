package com.monkeybeat.profileservice.model;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "profile")
@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String userName;

    private Giphy[] favorites;

    private Giphy[] groupings;

}
