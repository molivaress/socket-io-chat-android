package com.olivares.demochat;

import android.app.Application;

import com.olivares.demochat.di.ApplicationComponent;
import com.olivares.demochat.di.DaggerApplicationComponent;

public class ChatApplication extends Application {


    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }


}
