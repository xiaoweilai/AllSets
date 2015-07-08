package com.source.all;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
    private TextView mTextView01;
    private TextView mTextView02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);

        mTextView01 = (TextView) findViewById(R.id.myTextView01);
        mTextView01.setText("我是应用Drawable 背景色的戴维文本");

        Resources resources = getBaseContext().getResources();
        Drawable HippoDrawable = resources.getDrawable(R.color.green);
        mTextView01.setBackgroundDrawable(HippoDrawable);

        mTextView02 = (TextView)findViewById(R.id.myTextView02);

        /*  以下使用 Color.MAGENTA 指定文本的颜色为紫红色 */
        mTextView02.setTextColor(Color.MAGENTA);
    }

}
