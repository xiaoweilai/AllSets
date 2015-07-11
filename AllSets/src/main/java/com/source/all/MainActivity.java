package com.source.all;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    /* 先创建一个按钮 */
    private Button mButton1;
    //    private EditText et;
//    private RadioButton rb1;
//    private RadioButton rb2;
//    private Button mButton2;
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
        mButton1 = (Button)findViewById(R.id.myButton1);

        mButton1.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //TODO Auto-generated method stub
                /* 这里就是设置弹出对话框的地地方 */
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.app_about)
                        .setMessage(R.string.app_about_msg)
                        .setPositiveButton
                        (
                                R.string.str_ok,
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        /* 当“确定”按钮单击后“离开”程序  */
                                        finish();
                                    }
                                }

                        ).show();
            }

        });

    }

}