package com.cool.photoalbum.model.domain;

public class Category {
    String title;
    int img;
    int channel;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Category(String title, int img, int channel) {
        this.title = title;
        this.img = img;
        this.channel = channel;
    }
}
