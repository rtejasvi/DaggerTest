package com.juniper.daggertest.ui.common;

/**
 * Created by rtejasvi on 3/30/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.juniper.daggertest.App;

public abstract class BaseActivity extends ActionBarActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// Perform injection so that when this call returns all dependencies will be available for use.
        ((App) getApplication()).inject(this);
    }
}