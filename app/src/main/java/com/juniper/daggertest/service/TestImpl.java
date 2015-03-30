package com.juniper.daggertest.service;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by rtejasvi on 3/30/2015.
 */
public class TestImpl implements Test {

    @Inject
    Context ctx;

    @Override
    public String getString() {
        if(ctx==null){
            return "Dagger being called, but context still null";
        }
        return "Hey, It's a success!";
    }
}
