package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button login;
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        login = (Button) findViewById(R.id.login);


            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    check(username.getText().toString(),password.getText().toString());
                }
            });
    }
    private void check(String userdata, String pwd){
    if((userdata.equals("admin")) &&(pwd.equals("admin"))){
        Toast.makeText(Login.this,"Login Successfully",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Login.this,log2.class);
        startActivity(intent);
        }else{
        Toast.makeText(Login.this,"UserName or Password Incorrect",Toast.LENGTH_LONG).show();
    }
    }

}
