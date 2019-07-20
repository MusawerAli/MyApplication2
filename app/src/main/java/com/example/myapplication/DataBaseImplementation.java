package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataBaseImplementation extends AppCompatActivity implements View.OnClickListener{
    EditText editFirstName,editLastName,editId;
    Button  btnInsert,btnView,btnUpdate,btnDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base_implementation);

        editFirstName = (EditText) findViewById(R.id.editFirstName);
        editLastName = (EditText) findViewById(R.id.editLastName);
        editId = (EditText) findViewById(R.id.editId);

        btnInsert = (Button) findViewById(R.id.btnInsert);
        btnView = (Button) findViewById(R.id.btnView);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);

    }

    @Override
    public void onClick(View view) {
    switch(view.getId()){
        case R.id.btnInsert:

            String firstName    = editFirstName.getText().toString();

            String lastName     = editLastName.getText().toString();


        break;


        case R.id.btnView:


        break;
    }
    }
}
