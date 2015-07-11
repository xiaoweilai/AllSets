package com.source.all;

//import com.source.all.R;
import android.app.Activity;
/* 打勾显示输入的密码 */
import android.content.res.Configuration;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
//import android.app.AlertDialog;
//import android.content.DialogInterface;
//import android.app.ProgressDialog;
import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
import android.util.DisplayMetrics;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.CheckBox;
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
import android.content.res.Resources;

import java.util.Locale;
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
    private EditText et;
    private CheckBox cb;
    /* 创建一个全局的类成员变量，类型为ProgressDialog对象 */
//    public ProgressDialog myDialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
        Resources res = getResources();
        /* 更改语系为Japen */
        Configuration conf =  res.getConfiguration();
        conf.locale = Locale.JAPAN;
        DisplayMetrics dm  = res.getDisplayMetrics();
        /*保存语系更改 */
        res.updateConfiguration(conf,dm);

//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);
    }

}
