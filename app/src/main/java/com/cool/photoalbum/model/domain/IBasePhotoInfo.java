package com.cool.photoalbum.model.domain;

import android.os.Parcelable;

import com.chad.library.adapter.base.entity.SectionEntity;

public interface IBasePhotoInfo extends Parcelable, SectionEntity {

    String smallUrl();

    String bigUrl();

    String videoUrl();
}
