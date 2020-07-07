package com.wsl.logs.application;

import android.app.Application;

import com.wsl.logs.widgets.log.FloatingView;


/**
 * Created by zego on 2018/10/16.
 */

public class LogApplication extends Application {

    public static LogApplication logApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        logApplication = this;
    }

}
