package com.source.all;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.RadioButton;
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
        mButton1 = (Button)findViewById(R.id.button1);

        mButton1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                /*  取得输入的身高 */
                EditText et = (EditText)findViewById(R.id.height);
                double height = Double.parseDouble(et.getText().toString());
                /* 取得性别 */
                String sex = "";
                RadioButton rb1 = (RadioButton)findViewById(R.id.sex1);
                if(rb1.isChecked())
                {
                    sex = "M";
                }
                else
                {
                    sex = "F";
                }

                /* new一个Intent对象，并指定要启动的class */
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, EX03_10_1.class);

                /* new一个Bundle对象，并将要传递的数据传入 */
                Bundle bundle = new Bundle();
                bundle.putDouble("height", height);
                bundle.putString("sex", sex);

                /* 将Bundle对象assign给Intent */
                intent.putExtras(bundle);
                /* 调用一个新的Activity  即EX03_10_1*/
                startActivity(intent);

//                /* 关闭原本的 Activity */
//                MainActivity.this.finish();
            }

        });

    }
}