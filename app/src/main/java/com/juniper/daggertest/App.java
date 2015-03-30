package com.juniper.daggertest;

import android.app.Application;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by rtejasvi on 3/30/2015.
 */
public class App extends Application {

    private ObjectGraph objectGraph;
    @Override
    public void onCreate(){
        super.onCreate();
        objectGraph = ObjectGraph.create(new AppModule(this));
    }

//    protected List<Object> getModules() {
//        return Arrays.asList(
//                new AppModule(this)
//
//
//        );
//    }

    public void inject(Object object) {
        objectGraph.inject(object);
    }

}
