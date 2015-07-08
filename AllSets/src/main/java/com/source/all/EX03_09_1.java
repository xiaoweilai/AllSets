package com.source.all;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
/**
 * Created by John on 15-7-8.
 */
public class EX03_09_1 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* 加载mylayout.xml Layout */
        setContentView(R.layout.mylayout);

        /* 以findViewById()取得Button对象，并添加onClickListener */
        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                /* new一个Intent对象，并指定要启动的class */
                Intent intent = new Intent();
                intent.setClass(EX03_09_1.this, MainActivity.class);

                /* 调用一个新的Activity */
                startActivity(intent);
                /* 关闭原本的 Activity */
                EX03_09_1.this.finish();
            }
        });
    }
}
