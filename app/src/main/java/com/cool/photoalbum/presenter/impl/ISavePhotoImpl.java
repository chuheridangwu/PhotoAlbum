package com.cool.photoalbum.presenter.impl;

import com.cool.photoalbum.model.domain.IBasePhotoInfo;
import com.cool.photoalbum.utils.JsonCacheUtil;

import java.util.ArrayList;
import java.util.List;

public class ISavePhotoImpl {

    private static final String SAVE_KEY = "SAVE_KEY";

    public void savePhotoList(IBasePhotoInfo photoInfo){
        List<IBasePhotoInfo> photos = JsonCacheUtil.getInstance().getPhotos(SAVE_KEY);
        if (photos == null){
            photos = new ArrayList<>();
        }
        // 根据值判断是否删除
        List<IBasePhotoInfo> data = new ArrayList<>(photos);
        for (IBasePhotoInfo photo : data) {
            if (photo.smallUrl().equals(photoInfo.smallUrl())){
                photos.remove(photo);
            }
        }

        photos.add(photoInfo);

        JsonCacheUtil.getInstance().savePhotoInfo(SAVE_KEY,photos);
    }

    public void removePhoto(IBasePhotoInfo photoInfo){
        List<IBasePhotoInfo> photos = JsonCacheUtil.getInstance().getPhotos(SAVE_KEY);
        if (photos == null){
            photos = new ArrayList<>();
        }
        // 根据值判断是否删除
        List<IBasePhotoInfo> data = new ArrayList<>(photos);
        for (IBasePhotoInfo photo : data) {
            if (photo.smallUrl().equals(photoInfo.smallUrl())){
                photos.remove(photo);
            }
        }
        JsonCacheUtil.getInstance().savePhotoInfo(SAVE_KEY,photos);
    }

    public  List<IBasePhotoInfo>  getPhotoList(){
        return JsonCacheUtil.getInstance().getPhotos(SAVE_KEY);
    }

}
