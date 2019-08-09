package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Register_class extends SQLiteOpenHelper {
    SQLiteDatabase db;

    private static final String DATABASE_NAME = "student_info";
    private  static final int DATABASE_VERSION = 1;

    //DB TABLE
    private static final String TABLE_USER = "user";


    //Db columns
    private static  final   String  KEY_ROWID    =   "id";
    private static  final   String  KEY_USERNAME =   "username";
    private static  final   String  KEY_PASSWORD =   "password";
    private static  final   String  KEY_ROLE    =   "role";

    public Register_class(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String CREATE_USER_TABLES = "CREATE TABLE " +TABLE_USER+ "(" +KEY_ROWID+ " INTEGER PRIMARY KEY AUTOINCREMENT," +KEY_USERNAME+ " TEXT," +KEY_PASSWORD+ "TEXT" +KEY_ROLE+ "TEXT);";
        sqLiteDatabase.execSQL(CREATE_USER_TABLES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_USER );
        onCreate(sqLiteDatabase);

    }

    public long InsertUsers(String uname, String pwd, String urole) {
        db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(KEY_USERNAME,uname);
        cv.put(KEY_PASSWORD,pwd);
        cv.put(KEY_ROLE,urole);
        return db.insert(TABLE_USER,null,cv);


    }

}
