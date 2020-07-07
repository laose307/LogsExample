package com.wsl.logs;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wsl.logs.widgets.log.FloatingView;



public class BaseLogsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(BaseLogsGlobal.Debug){
            FloatingView.get().add(this);
        }

    }


    @Override
    protected void onStart() {
        super.onStart();

        if(BaseLogsGlobal.Debug){
            FloatingView.get().attach(this);
        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        if(BaseLogsGlobal.Debug){
            FloatingView.get().detach(this);
        }

    }
}
