package com.cool.photoalbum.utils;

import android.widget.Toast;

import com.cool.photoalbum.base.BaseApplication;

public class ToastUtils {
    public static Toast sToast;
    public static void showToast(String tips){
        if (sToast == null){
            sToast =Toast.makeText(BaseApplication.getAppContext(),tips,Toast.LENGTH_SHORT);
        }else {
            sToast.setText(tips);
        }
        sToast.show();
    }
}
