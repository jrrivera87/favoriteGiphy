package com.monkeybeat.profileservice.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Table(name = "favorites")
@Entity
public class FavoriteGrouping implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String description;

    private Giphy[] giphies;
}
