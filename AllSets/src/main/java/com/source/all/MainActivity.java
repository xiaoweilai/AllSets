package com.source.all;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.TextView;
//import android.util.DisplayMetrics;
//import android.content.res.Resources;
//import android.graphics.Color;
//import android.graphics.drawable.Drawable;


//import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.ActionBar;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;

//import android.view.ViewGroup;
//import android.os.Build;


public class MainActivity extends Activity {
    private Button mButton1;
    private Button mButton2;
    //    private TextView mTextView1;
    //    private TextView mTextView01;
//    private TextView mTextView02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);

        /* 以findViewById()取得Button对象，并添加onClickListerner  */
        mButton1 = (Button)findViewById(R.id.button1);

        mButton1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
//                mTextView1.setText("Hi, EveryOne!!");
                jumpToLayout2();
            }

        });

    }

    /* method jumpToLayout2:将layout由main.xml切换成mylayout.xml */
    public void jumpToLayout2()
    {
        /* 将layout改成mylayout.xml */
        setContentView(R.layout.mylayout);

        /*  以findViewById()取得button对象，并添加onClickLister */
        mButton2 = (Button)findViewById(R.id.button2);


        mButton2.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
//                mTextView1.setText("Hi,David!!!!!!");
                jumpToLayout1();

            }
        });

    }

    public void jumpToLayout1()
    {
        setContentView(R.layout.fragment_main);
        /* 以findViewById()取得Button对象，并添加onClickListerner  */
        mButton1 = (Button)findViewById(R.id.button1);

        mButton1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
//                mTextView1.setText("Hi, EveryOne!!");
                jumpToLayout2();
            }
        });
    }
}