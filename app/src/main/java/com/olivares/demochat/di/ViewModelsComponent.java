package com.olivares.demochat.di;

import com.olivares.demochat.ui.chat.ChatViewModel;
import com.olivares.demochat.ui.login.LoginViewModel;

import dagger.Component;


@PerActivity
@Component( dependencies = {ApplicationComponent.class})
public interface ViewModelsComponent {

    void inject(ChatViewModel chatViewModel);
    void inject(LoginViewModel loginViewModel);

}
