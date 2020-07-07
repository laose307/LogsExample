package com.wsl.logs.util;

import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

import com.wsl.logs.application.LogApplication;


/**
 * Copyright © 2016 Zego. All rights reserved.
 * des: Preference管理工具类.
 * 主要用于存储一些临时数据
 */
public class PreferenceUtil {

    /**
     * 单例.
     */
    public static PreferenceUtil sInstance;

    public static final String SHARE_PREFERENCE_NAME = "ZEGO_DEMO_PLAYGROUND";

    public static final String KEY_APP_ID = "PLAYGROUND_APP_ID";
    public static final String KEY_APP_SIGN = "PLAYGROUND_APP_SIGN";
    public static final String KEY_TEST_ENVIRONMENT = "PLAYGROUND_ENV";
    public static final String KEY_SCENARIO="PLAYGROUND_SCENARIO";

    public static final String KEY_USERID="USERID";
    public static final String KEY_USERNAME="USERNAME";
    public static final String KEY_PUSHINFO="PUSHINFO";
    public static final String KEY_CHANNEL_ID="CHANNEL_ID";
    private SharedPreferences mSharedPreferences;
    private ACache mACache;
    private PreferenceUtil() {
        mSharedPreferences = LogApplication.logApplication.getSharedPreferences(SHARE_PREFERENCE_NAME, AppCompatActivity.MODE_PRIVATE);
        mACache=ACache.get( LogApplication.logApplication);
    }

    public static PreferenceUtil getInstance() {
        if (sInstance == null) {
            synchronized (PreferenceUtil.class) {
                if (sInstance == null) {
                    sInstance = new PreferenceUtil();
                }
            }
        }
        return sInstance;
    }



    public void setStringValue(String key, String value) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String getStringValue(String key, String defaultValue) {
        return mSharedPreferences.getString(key, defaultValue);
    }

    public void setBooleanValue(String key, boolean value) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }


    public boolean getBooleanValue(String key, boolean defaultValue) {
        return mSharedPreferences.getBoolean(key, defaultValue);
    }

    public void setIntValue(String key, int value) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public int getIntValue(String key, int defaultValue) {
        return mSharedPreferences.getInt(key, defaultValue);
    }

    public void setLongValue(String key, long value) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putLong(key, value);
        editor.commit();
    }

    public long getLongValue(String key, long defaultValue) {
        return mSharedPreferences.getLong(key, defaultValue);
    }

}
