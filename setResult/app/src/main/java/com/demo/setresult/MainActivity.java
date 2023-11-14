package com.demo.setresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, ActivityB.class);
        startActivityForResult(intent, REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        System.out.println("onActivityResult");

        if (requestCode == REQUEST_CODE) {
            System.out.println("REQUEST_CODE");
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    String result = data.getStringExtra("key");
                    System.out.println(result);
                }
            } else{
                System.out.println("NO_KEY");
            }
        }else{
            System.out.println("NO_REQUEST_CODE");
        }
    }
}