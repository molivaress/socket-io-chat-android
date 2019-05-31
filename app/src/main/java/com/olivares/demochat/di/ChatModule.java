package com.olivares.demochat.di;

import com.olivares.demochat.utils.SocketHelper;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ChatModule {

    @Singleton
    @Provides
    SocketHelper provideSocket() {
        return new SocketHelper();
    }
}
