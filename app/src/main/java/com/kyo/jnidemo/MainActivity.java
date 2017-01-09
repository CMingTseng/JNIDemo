package com.kyo.jnidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.kyo.jnidemo.jni.JNIDemoUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mBtn;
    private TextView mInfoTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBtn = (TextView) findViewById(R.id.jni_demo_btn);
        mInfoTv = (TextView) findViewById(R.id.jni_demo_info);

        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.jni_demo_btn){
            mInfoTv.setText(JNIDemoUtil.getString());
        }
    }
}
