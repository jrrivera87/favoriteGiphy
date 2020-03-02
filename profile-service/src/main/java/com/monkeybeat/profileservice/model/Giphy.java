package com.monkeybeat.profileservice.model;

import java.io.Serializable;

public class Giphy implements Serializable {

    private String type;
    private String id;
    private String url;
  'import_datetime': string;
  'trending_datetime': string;
    images: {
        original: {
            frames: string;
            hash: string;
            height: string;
            mp4: string;
            mp4_size: string;
            size: string;
            url: string;
            webp: string;
            webp_size: string;
            width: string;
        }
    };
}
