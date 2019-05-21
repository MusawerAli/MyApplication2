package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class Spinner extends AppCompatActivity {

    Spinner sp;
    String[] countries = {"pakistan","Germany","N-Korea","Hungary","Beijing"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

//        sp = (Spinner) findViewById(R.id.spinner);
    }
}
