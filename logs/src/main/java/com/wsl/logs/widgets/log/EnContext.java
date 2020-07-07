package com.wsl.logs.widgets.log;

import android.app.Application;

import com.wsl.logs.application.LogApplication;


public class EnContext {

    private static final Application INSTANCE = LogApplication.logApplication;


    public static Application get() {
        return INSTANCE;
    }
}
