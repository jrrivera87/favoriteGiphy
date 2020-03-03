package com.monkeybeat.profileservice.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Table(name = "giphy")
@Entity
public class Giphy implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID giphyId;

    private String type;

    private String id;

    private String url;

    private String importDatetime;

    private String trendingDatetime;

    private Images images;
}
