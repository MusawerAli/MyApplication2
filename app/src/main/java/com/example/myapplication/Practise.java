package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Practise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise);

        //Inititilize Variables
        final Button reverse_string;

        //GEt by ID

        reverse_string = (Button) findViewById(R.id.reverse_string);
        reverse_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(Practise.this, StringReverse.class);
                startActivity(id);
            }
        });
    }

}
