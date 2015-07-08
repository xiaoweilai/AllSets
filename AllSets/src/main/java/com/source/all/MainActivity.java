package com.source.all;

import android.app.Activity;
//import android.content.res.Resources;
//import android.graphics.Color;
//import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;
import android.util.DisplayMetrics;

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
    private TextView mTextView01;
//    private TextView mTextView02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);
        /*  必须引用android.util.DisplayMetrics */
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        String strOpt = "手机屏幕分辨率为：" +
                dm.widthPixels + " x " + dm.heightPixels;

        mTextView01 = (TextView) findViewById(R.id.myTextView01);
        mTextView01.setText(strOpt);
    }
}