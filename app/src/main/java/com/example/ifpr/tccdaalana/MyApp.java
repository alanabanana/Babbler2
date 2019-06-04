package com.example.ifpr.tccdaalana;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {
    private static Context context;
    private static MyApp my_instance;

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        my_instance = this;
        context = this;
    }

    public static synchronized MyApp getInstance() {
        return my_instance;
    }

    public static synchronized Context getContext() {
        return context;
    }
}