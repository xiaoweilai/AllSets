package com.source.all;

//import com.source.all.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
//import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.widget.EditText;
///* 欲在Layout里使用Gallery widget，必须引用这些模块 */
//import android.content.Context;
//import android.widget.Gallery;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.ImageSwitcher;

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
    private Button mButton1;
    private TextView mTextView1;
    /* 创建一个全局的类成员变量，类型为ProgressDialog对象 */
//    public ProgressDialog myDialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);

        mButton1 = (Button)findViewById(R.id.myButton1);
        mTextView1 = (TextView)findViewById(R.id.myTextView1);
        mButton1.setOnClickListener(myShowAlertDialog);
    }

    /* 单击按钮运行的OnClickListener事件方法 */
    Button.OnClickListener myShowAlertDialog =
    new Button.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle(R.string.str_alert_title) //设置标题
                    .setItems(R.string.str_alert_body,
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    CharSequence strDialogBody = getString(R.string.str_alert_body);

                                    String[] aryShop = getResources().getStringArray(R.array.items_irdc_dialog);
                                    new AlertDialog.Builder(MainActivity.this)
                                            .setMessage(strDialogBody + aryShop[i])
                                            .setNeutralButton(R.string.str_ok,
                                                    new DialogInterface.OnClickListener() {
                                                        @Override
                                                        public void onClick(DialogInterface dialogInterface, int i) {
                                                            /* 在这里处理要做的事 */
                                                        }
                                                    }).show();

                                }
                            }
                    ).show();
        }
    };

}
