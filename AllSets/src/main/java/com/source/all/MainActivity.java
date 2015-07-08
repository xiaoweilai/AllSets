package com.source.all;

import android.app.Activity;
//import android.content.res.Resources;
//import android.graphics.Color;
//import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

//import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.ActionBar;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.ViewGroup;
//import android.os.Build;


public class MainActivity extends Activity {
//    private TextView mTextView01;
    private TextView mTextView02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);
        mTextView02 = (TextView) findViewById(R.id.myTextView02);
        CharSequence str_2 = getString(R.string.str_2);
        String str_3 = "我是程序里调用Resource的";
        mTextView02.setText(str_3 + str_2);
    }
}