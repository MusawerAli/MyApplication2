package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button start_btn;
    Button reset_btn;
    Button guess_btn, arr_btn,radio_btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.msg);
        start_btn = (Button) findViewById(R.id.start_btn);
        reset_btn = (Button) findViewById(R.id.reset_btn);


        guess_btn = (Button) findViewById(R.id.guessgame);
        arr_btn = (Button) findViewById(R.id.arr);
        radio_btn = (Button) findViewById(R.id.radio);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                tv.setText("Counter: " + counter);
            }
        });


        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                counter = 0;
                tv.setText("Counter: " + counter);
            }
        });

        guess_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(MainActivity.this, Conditions.class);
                startActivity(id);
            }
        });
        arr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(MainActivity.this, array.class);
                startActivity(id);
            }
        });

        radio_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(MainActivity.this, Radio.class);
                startActivity(id);
            }
        });


    }
}
