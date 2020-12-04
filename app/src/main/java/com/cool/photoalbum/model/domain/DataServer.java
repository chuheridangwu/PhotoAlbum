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
            Category category1 = new Category(BaseApplication.getAppContext().getString(R.string.Beauty_car_model), R.mipmap.category_girl1,2);
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

        // ACG动漫
        Category header1 = new Category(BaseApplication.getAppContext().getString(R.string.home_acg),0,0);
        header1.isHeader = true;
        list.add(header1);

        Category category_1 = new Category(BaseApplication.getAppContext().getString(R.string.home_hot), R.mipmap.home_rec_animal_1,100);
        Category category_2 = new Category(BaseApplication.getAppContext().getString(R.string.home_new), R.mipmap.home_rec_animal_2,101);
        Category category_3 = new Category(BaseApplication.getAppContext().getString(R.string.home_rec), R.mipmap.home_rec_animal_3,102);
        list.add(category_1);
        list.add(category_2);
        list.add(category_3);

        // 直播分类
        if (AppAccessRequest.getInstall().isOpen()){
            Category header2 = new Category(BaseApplication.getAppContext().getString(R.string.home_live),0,0);
            header2.isHeader = true;
            list.add(header2);

            Category category_11 = new Category(BaseApplication.getAppContext().getString(R.string.home_hot), R.mipmap.home_live_1,200);
            category_11.setUrl("mf/jsonmitao.txt");
            Category category_12 = new Category(BaseApplication.getAppContext().getString(R.string.home_new), R.mipmap.home_live_2,201);
            category_12.setUrl("mf/jsonxiaohongmao.txt");
            Category category_13 = new Category(BaseApplication.getAppContext().getString(R.string.home_rec), R.mipmap.home_live_3,202);
            category_13.setUrl("mf/jsonyinghua.txt");
            list.add(category_11);
            list.add(category_12);
            list.add(category_13);
        }
        // 图片分类
        Category header0 = new Category(BaseApplication.getAppContext().getString(R.string.recommended),0,0);
        header0.isHeader = true;
        list.add(header0);

        if (AppAccessRequest.getInstall().isOpen()){
            Category category1 = new Category(BaseApplication.getAppContext().getString(R.string.Beauty_car_model), R.mipmap.home_recommend_beauty,2);
            list.add(category1);
        }

        Category category0 = new Category(BaseApplication.getAppContext().getString(R.string.cute_animal), R.mipmap.home_recommend_animal,15);
        Category category8 = new Category(BaseApplication.getAppContext().getString(R.string.romantic_love), R.mipmap.home_recommend_avatar,4);
        Category category2 = new Category(BaseApplication.getAppContext().getString(R.string.cartoon_anime), R.mipmap.home_recommend_cartoons,6);

        Category category10 = new Category(BaseApplication.getAppContext().getString(R.string.gourmet), R.mipmap.home_recommend_food,19);
        Category category12 = new Category(BaseApplication.getAppContext().getString(R.string.lovely), R.mipmap.home_recommend_lovely,13);

        list.add(category10);
        list.add(category12);

        list.add(category0);

        list.add(category2);
        list.add(category8);

        return list;
    }
}
