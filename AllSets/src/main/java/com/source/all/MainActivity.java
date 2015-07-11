package com.source.all;

import com.source.all.R;
import android.app.Activity;
/* 必须引用graphics.Typeface 才能使用creatFromAssert()来改变字体 */
import android.content.res.Resources;
import android.graphics.Typeface;
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
    private Button sizeButton;
    private Button fontButton;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);

        /* 以findViewById()取得Button对象，并添加onClickListerner  */
        sizeButton = (Button)findViewById(R.id.sizebutton);
        fontButton = (Button)findViewById(R.id.fontbutton);
        mText = (TextView)findViewById(R.id.mytextview);

        /* 除了将字体文件放入手机中，也可以将字体以import方式导入项目资源，方法如下 ：*/


        /* 设置onClickListener与按钮对象连接  */
        sizeButton.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /* 使用setTextSize()来改变字体大小*/
                mText.setTextSize(20);
            }

        });

        /* 设置onClickListener与按钮对象连接  */
        fontButton.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /*  必须事先在asserts底下创建一个fonts文件夹
                * 并放入要使用的字体文件(.ttf)
                * 并提供相对路径给createFromAssert来创建Typeface对象 */
//                assets\fonts\HandmadeTypewriter.ttf  此目录与AndroidManifetst.xml并列
                mText.setTypeface(Typeface.createFromAsset(getAssets(),
                        "fonts/HandmadeTypewriter.ttf"));


            }



        });

    }

}