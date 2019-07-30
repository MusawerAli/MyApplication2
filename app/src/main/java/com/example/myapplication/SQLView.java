package com.example.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SQLView extends AppCompatActivity {

    TextView tvresult;
    SqLite_DB db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlview);
        tvresult = (TextView) findViewById(R.id.tvresult);
        db = new SqLite_DB(this);
        String data = db.getData();
        tvresult.setText(data);
    }
}
