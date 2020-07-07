package com.wsl.logsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wsl.logs.BaseLogsActivity;
import com.wsl.logs.util.AppLogger;

public class MainActivity extends BaseLogsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppLogger.getInstance().e("error %s","测试错误");
        AppLogger.getInstance().i("info %s","测试信息");
        AppLogger.getInstance().d("debug %s","测试调试");
        AppLogger.getInstance().w("warn %s","测试警告");
    }
}
