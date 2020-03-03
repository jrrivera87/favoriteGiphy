package com.monkeybeat.profileservice.dto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

public class ImagesDTO implements Serializable {

    private UUID id;

    private Original original;
}
