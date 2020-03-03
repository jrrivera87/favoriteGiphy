package com.monkeybeat.profileservice.dto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

public class FavoriteGroupingDTO implements Serializable {

    private UUID id;

    private String description;

    private GiphyDTO[] giphies;
}
