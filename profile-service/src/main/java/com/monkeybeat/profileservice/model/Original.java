package com.monkeybeat.profileservice.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Table(name = "original")
@Entity
public class Original implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String frames;

    private String hash;

    private String height;

    private String mp4;

    private String mp4_size;

    private String size;

    private String url;

    private String webp;

    private String webp_size;

    private String width;
}
