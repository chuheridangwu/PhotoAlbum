package com.cool.photoalbum.model.domain;

import com.cool.photoalbum.R;
import com.cool.photoalbum.base.BaseApplication;
import com.cool.photoalbum.utils.AppAccessRequest;

import java.util.ArrayList;
import java.util.List;

public class DataServer {
    private DataServer(){

    }

    public static List<Category> getCategoryList(){
        List<Category> list = new ArrayList<>();

        if (AppAccessRequest.getInstall().isOpen()){
            Category category1 = new Category(BaseApplication.getAppContext().getString(R.string.Beauty_car_model), R.mipmap.category_girl,2);
            list.add(0,category1);
        }

        Category category0 = new Category(BaseApplication.getAppContext().getString(R.string.Landscape_architecture), R.mipmap.category_scape,1);
        Category category8 = new Category(BaseApplication.getAppContext().getString(R.string.star_photo), R.mipmap.category_star,3);
        Category category2 = new Category(BaseApplication.getAppContext().getString(R.string.romantic_love), R.mipmap.category_love,4);
        Category category9 = new Category(BaseApplication.getAppContext().getString(R.string.flowers), R.mipmap.category_forest,16);
        Category category3 = new Category(BaseApplication.getAppContext().getString(R.string.cartoon_anime), R.mipmap.category_cartoons,6);
        Category category4 = new Category(BaseApplication.getAppContext().getString(R.string.luxury_car_selection), R.mipmap.category_car,10);
        Category category5 = new Category(BaseApplication.getAppContext().getString(R.string.cute_animal), R.mipmap.category_anima,11);
        Category category6 = new Category(BaseApplication.getAppContext().getString(R.string.mysterious_constellation), R.mipmap.category_constellation,18);
        Category category7 = new Category(BaseApplication.getAppContext().getString(R.string.creative_design), R.mipmap.category_creativity,14);
        list.add(category0);
        list.add(category2);
        list.add(category8);
        list.add(category9);
        list.add(category3);
        list.add(category4);
        list.add(category5);
        list.add(category6);
        list.add(category7);

        return list;
    }

    public static  List<String> getRecommendTags(){
        List<String> textList = new ArrayList<>();
        textList.add(BaseApplication.getAppContext().getString(R.string.morning));
        textList.add(BaseApplication.getAppContext().getString(R.string.school_flower));
        textList.add(BaseApplication.getAppContext().getString(R.string.handsome_guy));
        textList.add(BaseApplication.getAppContext().getString(R.string.beauty));
        textList.add(BaseApplication.getAppContext().getString(R.string.lovely));
        textList.add(BaseApplication.getAppContext().getString(R.string.avatar));
        textList.add(BaseApplication.getAppContext().getString(R.string.wallpaper));
        textList.add(BaseApplication.getAppContext().getString(R.string.football));
        textList.add(BaseApplication.getAppContext().getString(R.string.basketball));
        textList.add(BaseApplication.getAppContext().getString(R.string.landscape));
        textList.add(BaseApplication.getAppContext().getString(R.string.fitness));
        return  textList;
    }

    public static List<Category> getRecommendCategory(){
        List<Category> list = new ArrayList<>();

        if (AppAccessRequest.getInstall().isOpen()){
            Category category1 = new Category(BaseApplication.getAppContext().getString(R.string.Beauty_car_model), R.mipmap.home_recommend_beauty,2);
            list.add(0,category1);
        }

        Category category0 = new Category(BaseApplication.getAppContext().getString(R.string.cute_animal), R.mipmap.home_recommend_animal,15);
        Category category8 = new Category(BaseApplication.getAppContext().getString(R.string.romantic_love), R.mipmap.home_recommend_avatar,4);
        Category category2 = new Category(BaseApplication.getAppContext().getString(R.string.cartoon_anime), R.mipmap.home_recommend_cartoons,6);
        Category category9 = new Category(BaseApplication.getAppContext().getString(R.string.flowers), R.mipmap.home_recommend_plant,16);
        Category category3 = new Category(BaseApplication.getAppContext().getString(R.string.wallpaper), R.mipmap.home_recommend_weather,6);

        Category category10 = new Category(BaseApplication.getAppContext().getString(R.string.gourmet), R.mipmap.home_recommend_food,19);
        Category category11 = new Category(BaseApplication.getAppContext().getString(R.string.funny), R.mipmap.home_recommend_funny,20);
        Category category12 = new Category(BaseApplication.getAppContext().getString(R.string.lovely), R.mipmap.home_recommend_lovely,13);
        Category category13 = new Category(BaseApplication.getAppContext().getString(R.string.beautiful_text), R.mipmap.home_recommend_text,17);

        list.add(category10);
        list.add(category12);

        list.add(category0);
        list.add(category13);

        list.add(category2);
        list.add(category8);
        list.add(category9);
        list.add(category3);

        list.add(category11);

        return list;
    }
}
