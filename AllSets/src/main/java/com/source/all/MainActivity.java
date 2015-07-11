package com.source.all;

//import com.source.all.R;
import android.app.Activity;
//import android.app.AlertDialog;
//import android.content.DialogInterface;
//import android.app.ProgressDialog;
import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.EditText;
///* 欲在Layout里使用Gallery widget，必须引用这些模块 */
//import android.content.Context;
//import android.widget.Gallery;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.ImageSwitcher;

//import android.content.Intent;
//import android.widget.RadioButton;
//import android.widget.TextView;
//import android.util.DisplayMetrics;
//import android.content.res.Resources;
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
//    private Button mButton1;
//    private TextView mTextView1;
    /* 创建一个全局的类成员变量，类型为ProgressDialog对象 */
//    public ProgressDialog myDialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        /* * 套用透明背景的主题 **/
        setTheme(R.style.Theme_Transparent);

        /* * 套用布景主题1 * */
        setTheme(R.style.Theme_Translucent);

        /* * 套用布景主题2 */
        setTheme(R.style.Theme_Translucent2);


        setContentView(R.layout.fragment_main);

//        mButton1 = (Button)findViewById(R.id.myButton1);
//        mTextView1 = (TextView)findViewById(R.id.myTextView1);
//        mButton1.setOnClickListener(myShowAlertDialog);
    }

}
