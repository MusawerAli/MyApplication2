package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Register extends AppCompatActivity {

    Register_class db;
    EditText username,password,role;
    Button  signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


            username = (EditText) findViewById(R.id.username);
            password = (EditText) findViewById(R.id.password);
            role = (EditText) findViewById(R.id.role);
            signup = (Button) findViewById(R.id.signup);

            signup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Toast.makeText(Register.this,role.getText().toString(), Toast.LENGTH_LONG).show();
                        String Uname = username.getText().toString();
                        String pwd  =   password.getText().toString();
                        String Urole   =   role.getText().toString();
                    db.InsertUsers(Uname,pwd,Urole);


                }
            });
    }
}
