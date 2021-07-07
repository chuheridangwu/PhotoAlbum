package com.cool.photoalbum.base;
import android.app.Application;
import android.content.Context;

import com.cool.photoalbum.utils.AppAccessRequest;
import com.google.android.gms.ads.MobileAds;

public class BaseApplication extends Application {

    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getBaseContext();
        MobileAds.initialize(this);
        AppAccessRequest.getInstall().getAppAccess();
    }

    public static Context getAppContext(){
        return appContext;
    }
}
