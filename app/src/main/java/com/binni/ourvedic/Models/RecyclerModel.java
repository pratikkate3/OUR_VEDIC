package com.binni.ourvedic.Models;

public class RecyclerModel {
    int image;
    String Text;

    public RecyclerModel(int image, String text) {
        this.image = image;
        Text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
