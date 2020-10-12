package com.cool.photoalbum.model.domain;

import com.cool.photoalbum.R;
import com.cool.photoalbum.utils.AppAccessRequest;

import java.util.ArrayList;
import java.util.List;

public class DataServer {
    private DataServer(){

    }

    public static List<Category> getCategoryList(){
        List<Category> list = new ArrayList<>();

        if (AppAccessRequest.getInstall().isOpen()){
            Category category1 = new Category("美女车模", R.mipmap.category_girl,2);
            list.add(0,category1);
        }

        Category category0 = new Category("风景建筑", R.mipmap.category_scape,1);
        Category category8 = new Category("明星写真", R.mipmap.category_star,3);
        Category category2 = new Category("浪漫爱情", R.mipmap.category_love,4);
        Category category9 = new Category("花草植物", R.mipmap.category_forest,16);
        Category category3 = new Category("卡通动漫", R.mipmap.category_cartoons,6);
        Category category4 = new Category("豪车精选", R.mipmap.category_car,10);
        Category category5 = new Category("动物萌宠", R.mipmap.category_anima,11);
        Category category6 = new Category("神秘星座", R.mipmap.category_constellation,18);
        Category category7 = new Category("创意设计", R.mipmap.category_creativity,14);
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
        textList.add("早上好");
        textList.add("早安");
        textList.add("唯美");
        textList.add("情侣头像");
        textList.add("情侣头像");
        return  textList;
    }

    public static List<Category> getRecommendCategory(){
        List<Category> list = new ArrayList<>();

        if (AppAccessRequest.getInstall().isOpen()){
            Category category1 = new Category("美女车模", R.mipmap.home_recommend_beauty,2);
            list.add(0,category1);
        }

        Category category0 = new Category("风景建筑", R.mipmap.home_recommend_animal,1);
        Category category8 = new Category("明星写真", R.mipmap.home_recommend_avatar,3);
        Category category2 = new Category("浪漫爱情", R.mipmap.home_recommend_cartoons,4);
        Category category9 = new Category("花草植物", R.mipmap.home_recommend_plant,16);
        Category category3 = new Category("卡通动漫", R.mipmap.home_recommend_weather,6);
        list.add(category0);
        list.add(category2);
        list.add(category8);
        list.add(category9);
        list.add(category3);

        return list;
    }
}
