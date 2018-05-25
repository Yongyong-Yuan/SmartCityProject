package com.example.yongyong.smartcityproject;

import android.app.Application;
import android.content.Context;

import com.secneo.sdk.Helper;

/**
 * Created by yongyong on 5/23/18.
 */

public class MyApplication extends Application{
    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MyApplication.this);
    }
}

