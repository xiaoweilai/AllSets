package com.source.all;

import android.app.Activity;
/* 必须引用graphics.Color才能使用Color.*对象 */
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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
    private Button mButton;
    private TextView mText;
    private int[] mColors;
    private int colornum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);

        /* 以findViewById()取得Button对象，并添加onClickListerner  */
        mButton = (Button)findViewById(R.id.mybutton);
        mText = (TextView)findViewById(R.id.mytext);

        /* 声明并构造一整数array来存储欲使用的文字颜色 */
        mColors = new int[]{Color.BLACK, Color.RED, Color.BLUE, Color.GREEN,
                Color.MAGENTA, Color.YELLOW};

        colornum = 0;

        mButton.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /* 使用onClick让用户点下按钮来驱动变动文本颜色 */
                if(colornum < mColors.length)
                {
                    mText.setTextColor(mColors[colornum]);
                    colornum++;
                }
                else
                {
                    colornum = 0;
                }
            }

        });

    }

}