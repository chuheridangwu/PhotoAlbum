package com.cool.photoalbum.model.domain;

import android.os.Parcelable;

public interface IBasePhotoInfo extends Parcelable {

    String smallUrl();

    String bigUrl();
}
