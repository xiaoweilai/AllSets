package com.source.all;

//import com.source.all.R;
import android.app.Activity;
//import android.view.KeyEvent;
///* 打勾显示输入的密码  语系*/
//import android.content.res.Configuration;
//import android.util.DisplayMetrics;
//import android.text.method.HideReturnsTransformationMethod;
//import android.text.method.PasswordTransformationMethod;
//import android.app.AlertDialog;
//import android.content.DialogInterface;
//import android.app.ProgressDialog;
import android.os.Bundle;
//import android.text.Editable;
//import android.view.View;
/* 使用OnClickListener与OnFocusChangeListener来区分按钮的状态 */
//import android.view.View.OnClickListener;
//import android.view.View.OnFocusChangeListener;
//import android.widget.Button;
//import android.widget.ImageButton;
import android.widget.TextView;
//import android.util.DisplayMetrics;
//import android.widget.CompoundButton;
//import android.widget.EditText;
//import android.widget.Toast;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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

//import java.util.Locale;
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
    /* 声明TextView、CheckBox对象 */
//    private Button myButton;
    private TextView mTextView1;
//    private TextView myTextView2;
    private CheckBox mCheckBox1;
    private CheckBox mCheckBox2;
    private CheckBox mCheckBox3;

//    private EditText mEditText;
//    private Button mButton1;

//    private TextView mTextView1;
//    private ImageButton mImageButton1;
//    private EditText et;
//    private CheckBox cb;
//    private EditText mEditText01;
//    private TextView mTextView01;


    /* 创建一个全局的类成员变量，类型为ProgressDialog对象 */
//    public ProgressDialog myDialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);

        /*  透过findViewById建构对象 ,取得TextView对象并调整文字内容 */
        mTextView1 = (TextView)findViewById(R.id.myTextView1);
        mTextView1.setText("你所选择的项目有：");
        /* 透过findViewById取得三个CheckBox对象 */
        mCheckBox1 = (CheckBox)findViewById(R.id.myCheckBox1);
        mCheckBox2 = (CheckBox)findViewById(R.id.myCheckBox2);
        mCheckBox3 = (CheckBox)findViewById(R.id.myCheckBox3);
        /* 设定OnCheckedChangeListener给三个CheckBox对象 */
        mCheckBox1.setOnCheckedChangeListener(mCheckBoxChanged);
        mCheckBox2.setOnCheckedChangeListener(mCheckBoxChanged);
        mCheckBox3.setOnCheckedChangeListener(mCheckBoxChanged);

    }
    /* 声明并建构OnCheckedChangeListener对象 */
    private CheckBox.OnCheckedChangeListener mCheckBoxChanged =
            new CheckBox.OnCheckedChangeListener()
            {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    /* 透过getString()取得CheckBox的文字字符串 */
                    String str0 = "所选的项目为： ";
                    String str1 = getString(R.string.str_checkbox1);
                    String str2 = getString(R.string.str_checkbox2);
                    String str3 = getString(R.string.str_checkbox3);
                    String plus = ";";
                    String result = "但是超过预算啰！！";
                    String result2 = "还可以再多买账本喔！！";
                    /* 任一CheckBox被勾选后，该CheckBox的文字会改变TextView的文字内容 * 三个对象总共八种 情境 */
                    if(mCheckBox1.isChecked() & mCheckBox2.isChecked() & mCheckBox3.isChecked())
                    {
                        mTextView1.setText(str0+str1+plus+str2+plus+str3+result);
                    }
                    else if(mCheckBox1.isChecked() & mCheckBox2.isChecked() & mCheckBox3.isChecked())
                    {
                        mTextView1.setText(str0+str2+plus+str3+result);
                    }
                    else  if(mCheckBox1.isChecked()==true & mCheckBox2.isChecked()==true & mCheckBox3.isChecked()==false)
                    {
                        mTextView1.setText(str0+str1+plus+str2+result); }
                    else if(mCheckBox1.isChecked()==false & mCheckBox2.isChecked()==false & mCheckBox3.isChecked()==true)
                    {
                        mTextView1.setText(str0+str3+plus+result2);
                    }
                    else if(mCheckBox1.isChecked()==false & mCheckBox2.isChecked()==true & mCheckBox3.isChecked()==false)
                    {
                        mTextView1.setText(str0+str2);
                    }
                    else if(mCheckBox1.isChecked()==true & mCheckBox2.isChecked()==false & mCheckBox3.isChecked()==false)
                    {
                        mTextView1.setText(str0+str1);
                    }
                    else if(mCheckBox1.isChecked()==false & mCheckBox2.isChecked()==false & mCheckBox3.isChecked()==false)
                    {
                        mTextView1.setText(str0);
                    }

                }
            };




}
