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
import android.text.Editable;
import android.view.View;
/* 使用OnClickListener与OnFocusChangeListener来区分按钮的状态 */
import android.view.View.OnClickListener;
//import android.view.View.OnFocusChangeListener;
import android.widget.Button;
//import android.widget.ImageButton;
import android.widget.TextView;
//import android.util.DisplayMetrics;
//import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
//import android.widget.CheckBox;
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
//    private Button mButton1;
    private Button mButton;
    private EditText mEditText;
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

        /*  透过findViewById建构三个对象 */
        mButton = (Button)findViewById(R.id.myButton);
        mEditText = (EditText)findViewById(R.id.myEditText);

        /* 透过OnClickLister来响应Button的onClick事件 */
        mButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                /* 声明字符串变量并取得用户输入的EditText字符串 */
                Editable str;
                str = mEditText.getText();
                /* 使用系统标准的makeText()方式来产生Toast讯息 */
                Toast.makeText(MainActivity.this, "你的愿望 " + str.toString() + "已送达耶稣圣诞老人信箱", Toast.LENGTH_LONG).show();
                /* 清空EditText */
                mEditText.setText("");
            }
        });





    }

}
