package com.source.all;

//import com.source.all.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0, R.string.app_about);
        menu.add(0,1,1, R.string.str_exit);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId())
        {
            case 0:
                openOptionsDialog();
                break;
            case 1:
                finish();
                break;
            default:
                break;
        }
        return true;
    }

    private void openOptionsDialog()
    {
        new AlertDialog.Builder(this)
                .setTitle(R.string.app_about)
                .setMessage(R.string.app_about_msg)
                .setPositiveButton(R.string.str_ok,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
    }
}