package com.monkeybeat.profileservice.dto;

import java.io.Serializable;
import java.util.UUID;

public class GiphyDTO implements Serializable {

    private UUID giphyId;

    private String type;

    private String id;

    private String url;

    private String importDatetime;

    private String trendingDatetime;

    private ImagesDTO images;
}
