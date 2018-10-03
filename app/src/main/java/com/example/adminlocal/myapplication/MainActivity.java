package com.example.adminlocal.myapplication;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                TextView tw =  findViewById(R.id.tw);
                tw.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                TextView tw =  findViewById(R.id.tw);
                //tw.setText("done!");
            }
        }.start();

        Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                // Do stuff...
            }
        });
    }
}
