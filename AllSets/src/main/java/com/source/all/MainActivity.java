package com.source.all;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/* 欲在Layout里使用Gallery widget，必须引用这些模块 */
import android.content.Context;
import android.widget.Gallery;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageSwitcher;

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
    private TextView mTextView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Called when the activity is first created. */
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_main);

        /* 以findViewById()取得TextView对象  */
        mTextView01 = (TextView)findViewById(R.id.myTextView01);
        mTextView01.setText(getString(R.string.str_txt1));
        mTextView01.setTextColor(Color.BLUE);

        ((Gallery)findViewById(R.id.myGallery1)).setAdapter(new ImageAdapter(this) );


    }

    /**
     * Created by John on 15-7-11.
     */
    public class ImageAdapter extends BaseAdapter {
        /* 类成员myContext为Context父类 */
        private Context myContext;

        /* 使用Android.R.drawable里的图片作为图库集，类型为整数数组 */
        private int[] myImageIds =
                {
                        android.R.drawable.btn_minus,
                        android.R.drawable.btn_radio,
                        android.R.drawable.ic_lock_idle_low_battery,
                        android.R.drawable.ic_menu_camera
                };
        /* 构造器只有一个参数，即要存储的Context */
        public ImageAdapter(Context c){this.myContext = c;}

        /* 返回所有已定义的图片总数量 */
        public int getCount() {return this.myImageIds.length;}

        /* 利用getItem方法，取得目前容器中图像的数组ID */
        public Object getItem(int position) {return position;}
        public long getItemId(int position) {return position;}

        /* 取得目前令人欲显示的图像View,传入数组ID值使之读取与成像 */
        public View getView(int position, View covertView,
                            ViewGroup parent)
        {
            /* 创建一个ImageView对象 */
            ImageView i = new ImageView(this.myContext);

            i.setImageResource(this.myImageIds[position]);
            i.setScaleType(ImageView.ScaleType.FIT_XY);

            /* 设置这个ImageView对象的宽高，单位为dip */
            i.setLayoutParams(new Gallery.LayoutParams(120,120));
            return i;
        }

        /* 依据距离中央的位移量 利用getScale返回Views的大小(0.0f to 1.0f) */
        public float getScale(boolean focused, int offset)
        {
            /* Formula:1 / (2 ^ offset) */
            return Math.max(0, 1.0f/(float)Math.pow(2, Math.abs(offset)));
        }
    }


}