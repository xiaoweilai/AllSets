package com.source.all;

//import com.source.all.R;
import android.app.Activity;
import android.app.ProgressDialog;
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
//    private Button mButton1;
//    private TextView mTextView1;
    /* 创建一个全局的类成员变量，类型为ProgressDialog对象 */
    public ProgressDialog myDialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.fragment_main);

        Button btnButton1 = new Button(this);
        this.setContentView(btnButton1);
        btnButton1.setText(R.string.str_btn1);

        /* 为创建好的按钮对象，指定OnClickListerner
        * 即单击按钮会运行的事件
        * 并在事件处理方法中显示ProgressBar */

        btnButton1.setOnClickListener(myShowPorgressBar);
    }

    /* 单击按钮运行的OnClickListener事件方法 */
    Button.OnClickListener myShowPorgressBar =
    new Button.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            final CharSequence strDialogTitle = getString(R.string.str_dialog_title);
            final CharSequence strDialogBody = getString(R.string.str_dialog_body);

                /* 显示Progress对话框 */
            myDialog = ProgressDialog.show(
                    MainActivity.this,
                    strDialogTitle,
                    strDialogBody,
                    true
            );

            new Thread()
            {
                public void run()
                {
                    try
                    {
                            /* 在这里写上要后台运行的代码段
                            * 为了明显看见效果，以暂停3秒作为示范 */
                        sleep(3000);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                    finally {
                            /*卸载所创建的myDialog对象 */
                        myDialog.dismiss();
                    }
                }
            }.start();   /* 开始运行线程 */
        } /* End:public void onClick(View arg0) */
    };

}
