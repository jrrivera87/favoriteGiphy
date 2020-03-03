package com.monkeybeat.profileservice.dto;

import com.monkeybeat.profileservice.model.FavoriteGrouping;

import java.util.UUID;

public class ProfileDTO {

    private UUID id;

    private String userName;

    private GiphyDTO[] favorites;

    private FavoriteGrouping groupings;

}
