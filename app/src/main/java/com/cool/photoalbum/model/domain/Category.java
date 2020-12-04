package com.cool.photoalbum.model.domain;

import com.chad.library.adapter.base.entity.SectionEntity;

public class Category implements SectionEntity {

    String title;
    int img;
    int channel;
    String url;
    boolean isHeader;

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
        this.url = url;
    }

    public void setHeader(boolean header) {
        isHeader = header;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean isHeader() {
        return isHeader;
    }

    @Override
    public int getItemType() {
        return isHeader ? SectionEntity.HEADER_TYPE : SectionEntity.NORMAL_TYPE;
    }
}
