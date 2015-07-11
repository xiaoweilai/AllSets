package com.source.all;

import com.source.all.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
///* 欲在Layout里使用Gallery widget，必须引用这些模块 */
//import android.content.Context;
//import android.widget.Gallery;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.ImageSwitcher;

//import android.content.Intent;
//import android.widget.EditText;
//import android.widget.RadioButton;
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
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextView2;
    private TextView mTextView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);

        /* 以findViewById()取得所部署的Layout对象  */
        mTextView2 = (TextView)findViewById(R.id.mTextView2);
        mTextView4 = (TextView)findViewById(R.id.mTextView4);
        mButton2 = (Button)findViewById(R.id.mButton2);
        mButton3 = (Button)findViewById(R.id.mButton3);
        mButton4 = (Button)findViewById(R.id.mButton4);
        mButton5 = (Button)findViewById(R.id.mButton5);
        mEditText1 = (EditText)findViewById(R.id.mText1);
        mEditText2 = (EditText)findViewById(R.id.mText2);

        //+
        mButton2.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                mTextView2.setText("+");
                String strRet = Integer.toString(Integer.parseInt(mEditText1.getText().toString()) +
                Integer.parseInt(mEditText2.getText().toString()));
                mTextView4.setText(strRet);
            }
        });

        //-
        mButton3.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                mTextView2.setText("-");
                String strRet = Integer.toString(Integer.parseInt(mEditText1.getText().toString())
                        -
                        Integer.parseInt(mEditText2.getText().toString()));
                mTextView4.setText(strRet);
            }
        });


        //*
        mButton4.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                mTextView2.setText("*");
                String strRet = Integer.toString(Integer.parseInt(mEditText1.getText().toString())
                        *
                        Integer.parseInt(mEditText2.getText().toString()));
                mTextView4.setText(strRet);
            }
        });


        // /
        mButton5.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                mTextView2.setText("/");
                String strRet = Integer.toString(Integer.parseInt(mEditText1.getText().toString())
                        /
                        Integer.parseInt(mEditText2.getText().toString()));
                mTextView4.setText(strRet);
            }
        });
    }




}