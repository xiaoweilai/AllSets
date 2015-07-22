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
import android.view.View;
/* 使用OnClickListener与OnFocusChangeListener来区分按钮的状态 */
//import android.view.View.OnClickListener;
//import android.view.View.OnFocusChangeListener;
import android.widget.Button;
//import android.widget.ImageButton;
import android.widget.TextView;
//import android.util.DisplayMetrics;
//import android.widget.CompoundButton;
//import android.widget.EditText;
//import android.widget.Toast;
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
    /* 声明TextView、CheckBox、Button对象 */
    private Button myButton;
    private TextView myTextView1;
    private TextView myTextView2;
    private CheckBox myCheckBox;

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

        /*  透过findViewById建构对象 ,取得TextView,CheckBox,Button */
        myTextView1 = (TextView)findViewById(R.id.myTextView1);
        myTextView2 = (TextView)findViewById(R.id.myTextView2);
        myCheckBox = (CheckBox)findViewById(R.id.myCheckBox);
        myButton = (Button)findViewById(R.id.myButton);
//        mEditText = (EditText)findViewById(R.id.myEditText);
        /* 将CheckBox、Button预设为未选取状态 */
        myCheckBox.setChecked(false);
        myButton.setEnabled(false);


        myCheckBox.setOnClickListener(new CheckBox.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                //TODO Auto_generated method stub
                if(myCheckBox.isChecked())
                {
                    myButton.setEnabled(true);
                    myTextView2.setText("");
                }
                else
                {
                    myButton.setEnabled(false);
                    myTextView1.setText(R.string.text1);
                    /* 在TextView2里显示出“请勾选我同意” */
                    myTextView2.setText(R.string.no);
                }
            }
        });


        myButton.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                if(myCheckBox.isChecked())
                {
                    myTextView1.setText(R.string.ok);
                }
                else
                {

                }
            }
        });




    }

}
