package com.mhr.demoapp.di;

import android.app.Application;

import com.mhr.demoapp.AndroidSampleApp;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by Mihir on 05/09/2017.
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance Builder application(Application application);
        AppComponent build();
    }

    void inject(AndroidSampleApp app);
}
