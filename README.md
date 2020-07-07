# LogsExample
app日志

## 一、引用类继承BaseLogsActivity 

代码案例
```
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
```
## 二、jcenter引用
```
implementation 'com.laose:AppLogs:0.0.2'

```
## 三、注意：发布屏蔽log插件,测试不屏蔽
代码案例

```
  public class MyApplication extends Application {
  
  
      @Override
      public void onCreate() {
          super.onCreate();
         //全局控制log
          BaseLogsGlobal.setIsDebug(BuildConfig.DEBUG);
      }
  
  
  }


```
