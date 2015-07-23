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
//import android.view.MotionEvent;
//import android.view.View;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;

//import android.util.DisplayMetrics;
//import android.widget.CompoundButton;
//import android.widget.EditText;
//import android.widget.Toast;
//import android.widget.CheckBox;
//import android.widget.CompoundButton;
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
    private RadioGroup mRadioGroup1;
    private RadioButton mRadio1,mRadio2;
    ArrayAdapter adapter2;
//    private TextView myTextView2;
//    private CheckBox mCheckBox1;
//    private CheckBox mCheckBox2;
//    private CheckBox mCheckBox3;

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
        mTextView1 = (TextView)findViewById(R.id.myTextView);
        mRadioGroup1 = (RadioGroup)findViewById(R.id.myRadioGroup);
        mRadio1 = (RadioButton)findViewById(R.id.myRadioButton1);
        mRadio2 = (RadioButton)findViewById(R.id.myRadioButton2);
        /* RadioGroup用OnCheckedChangeListener来执行 */
        mRadioGroup1.setOnCheckedChangeListener(mChangeRadio);

    }
    /* 声明并建构OnCheckedChangeListener对象 */
   private RadioGroup.OnCheckedChangeListener mChangeRadio =
            new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                    TODO Auto-generated method stub
                    if(i == mRadio1.getId())
                    {
                        /* 把mRadio1的内容传到mTextView1 */
                        mTextView1.setText(mRadio1.getText());
                    }
                    else if(i == mRadio2.getId())
                    {
                        mTextView1.setText(mRadio2.getText());
                    }
                }
            };



}
