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
import android.view.View;
/* 使用OnClickListener与OnFocusChangeListener来区分按钮的状态 */
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
//import android.util.DisplayMetrics;
//import android.widget.CompoundButton;
//import android.widget.EditText;
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
    private Button mButton1;
    private TextView mTextView1;
    private ImageButton mImageButton1;
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
        mImageButton1 = (ImageButton)findViewById(R.id.myImageButton1);
        mButton1 = (Button)findViewById(R.id.myButton1);
        mTextView1 = (TextView)findViewById(R.id.myTextView1);

        /* 透过OnFocusChangeListener来响应ImageButton的Focus事件  */
        mImageButton1.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                //TODO Auto-generated method stub
                /* 若ImageButton状态为OnFocus改变ImageButton的图片 * 并改变TextView的文字 */
                if(b)
                {
                    mTextView1.setText("图片按钮状态为:Got Focus");
                    mImageButton1.setImageResource(R.drawable.iconfull);
                }
                /* 若ImageButotn状态为offFocus改变ImageButton的图片 * 并改变textView的文字 */
                else
                {
                    mTextView1.setText("图片按钮状态为：Lost Focus");
                    mImageButton1.setImageResource(R.drawable.iconempty);
                }
            }
        });
        /* 透过OnClickListener来响应ImageButton的onClick事件  */
        mImageButton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                /* 若ImageButton状态为onClick改变ImageButton的图片 * 并改变textView的文字 */
                mTextView1.setText("图片按钮状态为：Got Click");
                mImageButton1.setImageResource(R.drawable.iconfull);
            }
        });

        /* 透过OnClickLister来响应Button的onClick事件 */
        mButton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                /* 若Button状态为onClick改变ImageButton的图片 * 并改变textView的文字 */
                mTextView1.setText("图片按钮状态为：Lost Focus");
                mImageButton1.setImageResource(R.drawable.iconempty);
            }
        });





    }

}
