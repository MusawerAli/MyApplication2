package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button start_btn;
    Button reset_btn;
    Button guess_btn, arr_btn,radio_btn,practise,spinner,chkbox,insert,login,register;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.msg);
        start_btn = (Button) findViewById(R.id.start_btn);
        reset_btn = (Button) findViewById(R.id.reset_btn);
        spinner =   (Button) findViewById(R.id.spinner);

        guess_btn = (Button) findViewById(R.id.guessgame);
        arr_btn = (Button) findViewById(R.id.arr);
        radio_btn = (Button) findViewById(R.id.radio);
        practise = (Button) findViewById(R.id.practise);
        insert = (Button) findViewById(R.id.insert);
        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);
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


                counter = 00;
                tv.setText("Counter: " + counter);
            }
        });

        //***   Redirect Buuton on Other Pages   ****//


        guess_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(MainActivity.this, Conditions.class);
                startActivity(id);
            }
        });
        practise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(MainActivity.this, Practise.class);
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


        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(MainActivity.this, Spinner.class);
                startActivity(id);
            }
        });
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(MainActivity.this, DataBaseImplementation.class);
                startActivity(id);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(MainActivity.this, Login.class);
                startActivity(id);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent id = new Intent(MainActivity.this,Register.class);
                startActivity(id);
            }
        });

    }
}
