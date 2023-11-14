package com.demo.setresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        returnResult();
    }

    private void returnResult() {
        Intent resultIntent = new Intent();
        resultIntent.putExtra("key", "key value"); // 添加结果数据，如果有需要的话
        setResult(RESULT_OK, resultIntent);
        finish();
    }

}