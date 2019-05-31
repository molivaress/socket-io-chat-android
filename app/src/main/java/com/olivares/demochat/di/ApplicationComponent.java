package com.olivares.demochat.di;

import android.app.Application;

import com.olivares.demochat.utils.SocketHelper;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component( modules = {ChatModule.class})
public interface ApplicationComponent {

    void inject(Application application);

    SocketHelper getSocketHelper();

}
