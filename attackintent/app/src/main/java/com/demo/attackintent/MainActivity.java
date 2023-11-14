package com.demo.attackintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.demo.setresult", "com.demo.setresult.ActivityB"));
            startActivityForResult(intent, 1);
        }catch (Exception e){
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == requestCode) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    String result = data.getStringExtra("key");
                    TextView textView = findViewById(R.id.textview);
                    textView.setText(result);
                }
            }
        }
    }
}