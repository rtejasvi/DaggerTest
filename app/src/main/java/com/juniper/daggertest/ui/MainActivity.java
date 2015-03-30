package com.juniper.daggertest.ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.juniper.daggertest.App;
import com.juniper.daggertest.R;
import com.juniper.daggertest.service.Test;
import com.juniper.daggertest.ui.common.BaseActivity;

import javax.inject.Inject;


public class MainActivity extends ActionBarActivity {

    @Inject
    Test test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App) getApplication()).inject(this);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.helloBox);
        tv.setText(test.getString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
