package com.juniper.daggertest;

import android.content.Context;

import com.juniper.daggertest.service.Test;
import com.juniper.daggertest.service.TestImpl;
import com.juniper.daggertest.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rtejasvi on 3/30/2015.
 */

@Module(
        injects = {MainActivity.class, TestImpl.class},
        library = true

)
public class AppModule {
    private App app;

    public AppModule(App app){
        this.app = app;
    }

    @Provides @Singleton public Context provideApplicationContext() {
        return app.getApplicationContext();
    }


    @Provides
    public Test providesTestService(TestImpl impl){
        return impl;
    }
}
