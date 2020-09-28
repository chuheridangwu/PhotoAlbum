package com.cool.photoalbum.model.domain;

import com.cool.photoalbum.R;

import java.util.ArrayList;
import java.util.List;

public class DataServer {
    private DataServer(){

    }

    public static List<Category> getCategoryList(){
        List<Category> list = new ArrayList<>();
        Category category0 = new Category("风景建筑", R.mipmap.category_scape,1);
        Category category1 = new Category("美女车模", R.mipmap.category_girl,3);
        Category category2 = new Category("浪漫爱情", R.mipmap.category_love,4);
        Category category3 = new Category("卡通动漫", R.mipmap.category_cartoons,6);
        Category category4 = new Category("豪车精选", R.mipmap.category_car,7);
        Category category5 = new Category("动物萌宠", R.mipmap.category_anima,8);
        Category category6 = new Category("神秘星座", R.mipmap.category_constellation,9);
        Category category7 = new Category("创意设计", R.mipmap.category_creativity,9);
        list.add(category0);
        list.add(category1);
        list.add(category2);
        list.add(category3);
        list.add(category4);
        list.add(category5);
        list.add(category6);
        list.add(category7);
        return list;
    }
}
