package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StringReverse extends AppCompatActivity {


    Button btn_click;
    EditText string,convert_string;
    String result="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_reverse);


        string = (EditText) findViewById(R.id.string);
        convert_string = (EditText) findViewById(R.id.convert_string);

        btn_click = (Button) findViewById(R.id.btn_click);

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String option = string.getText().toString();



                for(int i=option.length()-1; i>=0; i--) {
                    result = result + option.charAt(i);
                    convert_string.setText(result);
                }


            }
        });



    }
}
