package com.juniper.daggertest;

import com.juniper.daggertest.service.Test;
import com.juniper.daggertest.service.TestImpl;
import com.juniper.daggertest.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rtejasvi on 3/30/2015.
 */

@Module(
        injects = {MainActivity.class}

)
public class AppModule {
    private App app;

    public AppModule(App app){
        this.app = app;
    }

    @Provides
    public Test providesTestService(){
        return new TestImpl();
    }
}
