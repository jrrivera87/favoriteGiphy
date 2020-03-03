package com.monkeybeat.profileservice.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Table(name = "images")
@Entity
public class Images implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private Original original;
}
