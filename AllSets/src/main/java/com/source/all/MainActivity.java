package com.source.all;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Spinner;

public class MainActivity extends Activity {
    private static final String[] countriesStr = {"台北市", "台北县" , "台中市", "高雄市"};
    private TextView myTextView;
    private Spinner mySpinner;
    private ArrayAdapter adapter;
    Animation myAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        myTextView = (TextView)findViewById(R.id.myTextView);
        mySpinner  = (Spinner)findViewById(R.id.mySpinner);
        adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countriesStr);
        /* myspinner_dropdown为自定义下拉菜单样式定义在res/layout目录下 */
        adapter.setDropDownViewResource(R.layout.myspinner_dropdown);
        /* 将ArrayAdapter加入Spinner对象中 */
        mySpinner.setAdapter(adapter);
        /* 将mySpinner加入OnItemSelectedListener */
        mySpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                /* 将所选mySpinner的值带入myTextView中 */
                myTextView.setText("选择的是" + countriesStr[i]);
                /* 将mySpinner显示 */
                adapterView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        );

        /* 取得Animation定义在res/anim目录下 */
        myAnimation  =  AnimationUtils.loadAnimation(this, R.anim.my_anim);
        /* 将mySpinner加入OnTouchListener */
        mySpinner.setOnTouchListener(new Spinner.OnTouchListener()
        {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                /* 将mySpinner执行Animation */
                view.startAnimation(myAnimation);
                /* 将mySpinner隐藏 */
                view.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        mySpinner.setOnFocusChangeListener(new Spinner.OnFocusChangeListener()
        {
            @Override
            public void onFocusChange(View view, boolean b) {

            }
        });


    }
}




















