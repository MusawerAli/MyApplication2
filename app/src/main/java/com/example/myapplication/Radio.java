package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.myapplication.R.id.radio_group;

public class Radio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        RadioGroup radio_gp = (RadioGroup) findViewById(radio_group);
        radio_gp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton male =(RadioButton) findViewById(R.id.male);
                RadioButton female =(RadioButton) findViewById(R.id.female);
                if(male.isChecked()){
                    Toast.makeText();
                }
                else if{

                }
                else{

                }

            }
        });

    }
}
