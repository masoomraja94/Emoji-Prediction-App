package com.example.emojiprediction;

import com.google.gson.annotations.SerializedName;

public class ImageClass {

    @SerializedName("emoji")
    private String emoji;

    public ImageClass(String emoji) {
        this.emoji = emoji;
    }

    public String getCaption() {
        return emoji;
    }
}
