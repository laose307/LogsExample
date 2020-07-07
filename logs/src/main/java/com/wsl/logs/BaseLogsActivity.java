package com.wsl.logs;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wsl.logs.widgets.log.FloatingView;



public class BaseLogsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(BuildConfig.DEBUG){
            FloatingView.get().add(this);
        }

    }


    @Override
    protected void onStart() {
        super.onStart();

        // 在应用内实现悬浮窗，需要依附Activity生命周期
        // To realize the floating window in the application, it needs to adhere to the Activity life cycle

        if(BuildConfig.DEBUG){
            FloatingView.get().attach(this);
        }


    }

    @Override
    protected void onStop() {
        super.onStop();
        // // 在应用内实现悬浮窗，需要依附Activity生命周期
        // To realize the floating window in the application, it needs to adhere to the Activity life cycle

        if(BuildConfig.DEBUG){
            FloatingView.get().detach(this);
        }

    }
}
