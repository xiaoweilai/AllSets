package com.source.all;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.app.Activity;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView mTextView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);

        mTextView01 = (TextView) findViewById(R.id.myTextView01);

        String str_2 = "欢迎来到Android的TextView世界...";
        mTextView01.setText(str_2);

    }

}
