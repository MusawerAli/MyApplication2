package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class array extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        tv = (TextView) findViewById(R.id.output);
        String [] std = {
                "ALi",
                "Musawer",
                "Ghznfar",
                "Alao"
        };
        tv.setText(std[3]);
        for(int i=0; i<3; i++){



        }
    }
}
