package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Conditions extends AppCompatActivity {
Button btn_click;
EditText editText;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditions);

        btn_click = (Button) findViewById(R.id.btn_click);
        tv = (TextView) findViewById(R.id.tv);
        editText = (EditText) findViewById(R.id.editText);


        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String option = editText.getText().toString();

            if (option.equals("ali"))
            {
                tv.setText("Congrats K2 You Got 3.5 gp");
            }else if(option.equals("ghazanfar"))
            {
                tv.setText("Pa Ghazanfar Congrats you got 3.2 gp");
            }else if(option.equals("Gulfam")){
                tv.setText("Congrats you got 2.8 gp: Need For Improvements");
            }else if(option.equals("alaodeen")){
                tv.setText("Congrats Allaodeen 3.5 gp ai");
            }else if(option.equals("farhan")){
                tv.setText("Dig you got first time 3.5 gp ");
            }else{
                    tv.setText("Sorry Dear you are not able to this survay");
            }
            }
        });

    }
}
