package com.source.all;

/* import 相关class */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

/**
 * Created by John on 15-7-10.
 */
public class EX03_11_1 extends Activity{
    Bundle bundle;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* 加载mylayout.xml */
        setContentView(R.layout.mylayout);

        /* 取得Intent中的bundle对象 */
        intent = this.getIntent();
        bundle = intent.getExtras();

        /* 取得Bundle对象中的数据 */
        double height = bundle.getDouble("height");
        String sex = bundle.getString("sex");

        /* 判断性别 */
        String sexText = "";
        if(sex.equals("M"))
        {
            sexText = "男性";
        }
        else
        {
            sexText = "女性";
        }

        /* 取得标准体重 */
        String weight = this.getWeight(sex,height);

        /* 设置输出文字 */
        TextView tv1 = (TextView)findViewById(R.id.text1);
        tv1.setText("你是一位" + sexText + "\n你的身高是"
        + height + "厘米\n 你的标准体重是" + weight + "公斤");

        /* 以findViewById()取得button对象，并添加onClickListener */
        Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                /* 返回result 加上一个activity */
                EX03_11_1.this.setResult(RESULT_OK, intent);

                /*结束这个activity */
                EX03_11_1.this.finish();
            }
        });


    }

    /* 四舍五入的method */
    private String format(double num)
    {
        NumberFormat formatter = new DecimalFormat("0.00");
        String s = formatter.format(num);
        return s;
    }

    /* 以findViewById()取得Button对象，并添加onClickListener */
    private String getWeight(String sex, double height)
    {
        String weight = "";
        if(sex.equals("M"))
        {
            weight = format((height - 80)*0.7);
        }
        else
        {
            weight = format((height - 70)*0.6);
        }
        return weight;
    }




}
