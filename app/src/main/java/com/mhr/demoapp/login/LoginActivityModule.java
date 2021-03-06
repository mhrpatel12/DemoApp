package com.mhr.demoapp.login;

import com.mhr.demoapp.data.DatabaseService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mihir on 05/09/2017.
 */
@Module
public class LoginActivityModule {

    LoginActivity loginActivity;

    @Provides
    LoginView provideLoginView(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
        return loginActivity;
    }

    @Provides
    LoginPresenter provideLoginPresenter(LoginView loginView, DatabaseService databaseService) {
        return new LoginPresenterImpl(loginActivity,loginView, databaseService);
    }
}
