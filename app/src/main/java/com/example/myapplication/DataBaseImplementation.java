package com.example.myapplication;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.DialerKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DataBaseImplementation extends AppCompatActivity implements View.OnClickListener{
    EditText editFirstName,editLastName,editId;
    Button  btnInsert,btnView,btnUpdate,btnDelete;

    SqLite_DB db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base_implementation);

        editFirstName = (EditText) findViewById(R.id.editFirstName);
        editLastName = (EditText) findViewById(R.id.editLastName);
        editId = (EditText) findViewById(R.id.editId);

        btnInsert = (Button) findViewById(R.id.btnInsert);
        btnInsert.setOnClickListener(this);
        btnView = (Button) findViewById(R.id.btnView);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        db = new SqLite_DB(this);

    }


    @Override
    public void onClick(View view) {
    switch(view.getId()){
        case R.id.btnInsert:
            boolean fine = true;
            try{
                String firstName    = editFirstName.getText().toString();
                String lastName     = editLastName.getText().toString();
                db.insertStudents(firstName,lastName);
            }catch (Exception e){

                fine = false;

                String error = e.toString();
                Dialog d = new Dialog(this);
                d.setTitle("Sorry");
                TextView tv= new TextView(this);
                tv.setText(error);
                d.setContentView(tv);
                d.show();

        }finally {
                if(fine){
                    Dialog d = new Dialog(this);
                    d.setTitle("Sorry");
                    TextView tv= new TextView(this);
                    tv.setText("Success");
                    d.setContentView(tv);
                    d.show();
                }
            }


        break;


        case R.id.btnView:


        break;
    }
    }
}
