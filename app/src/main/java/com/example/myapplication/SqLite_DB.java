package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TableLayout;

public class SqLite_DB extends SQLiteOpenHelper {

    SQLiteDatabase db;

    //DB NAME
    private static final String DATABASE_NAME = "student_info";
    //DB Version
    private static final int DATABASE_VERSION=1;

    //DB TABLE
    private static final String TABLE_STUDENT = "tblstudent";

    //TABLE COLUMNS
    public static final String KEY_ROWID = "_id";
    public static final  String KEY_FIRST_NAME = "firstname";
    public static final String KEY_LAST_NAME = "lastname";

    public SqLite_DB( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    String CREATE_STUDENT_TABLE="CREATE TABLE " +TABLE_STUDENT+ "(" +KEY_ROWID+ " INTEGER PRIMARY KEY AUTOINCREMENT," +
            KEY_FIRST_NAME + " TEXT, " + KEY_LAST_NAME + " TEXT);";
        sqLiteDatabase.execSQL(CREATE_STUDENT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENT );
    onCreate(sqLiteDatabase);
    }

    public long insertStudents(String firstName, String lastName) {

            db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(KEY_FIRST_NAME,firstName);
        cv.put(KEY_LAST_NAME,lastName);
        return db.insert(TABLE_STUDENT,null,cv);




    }

    public String getData() {
        db = this.getReadableDatabase();
        String[] columns = new String[]{KEY_ROWID,KEY_FIRST_NAME,KEY_LAST_NAME};

        Cursor c = db.query(TABLE_STUDENT,columns,null,null,null,null,null);
        String result = "";
        int iRow = c.getColumnIndex(KEY_ROWID);
        int iFirstName = c.getColumnIndex(KEY_FIRST_NAME);
        int iLastName = c.getColumnIndex(KEY_LAST_NAME);

        for (c.moveToFirst();!c.isAfterLast();c.moveToNext()){

            result = result + c.getString(iRow) + "" + c.getString(iFirstName) + ""+c.getString(iLastName)+"\n";
        }
        db.close();
        return result;
    }

    public String getStudentLastName(long l) {
        db = this.getReadableDatabase();
        String[] columns = new String[]{KEY_ROWID,KEY_FIRST_NAME,KEY_LAST_NAME};

        Cursor c = db.query(TABLE_STUDENT,columns,KEY_ROWID+"="+l,null,null,null,null);
        if(c!=null){
            c.moveToFirst();
            String name = c.getString(2);
            return name;
        }
        return null;
    }

    public String getStudentFirstName(long l) {
        db = this.getReadableDatabase();
        String[] columns = new String[]{KEY_ROWID,KEY_FIRST_NAME,KEY_LAST_NAME};

        Cursor c = db.query(TABLE_STUDENT,columns,KEY_ROWID+"="+l,null,null,null,null);
        if(c!=null){
            c.moveToFirst();
            String name = c.getString(1);
            return name;
        }
        return null;
    }

    public void UpdateStudent(long l, String firstName, String lastName) {
    db = this.getWritableDatabase();
    ContentValues cv = new ContentValues();
    cv.put(KEY_FIRST_NAME,firstName);
    cv.put(KEY_LAST_NAME,lastName);
    db.update(TABLE_STUDENT,cv,KEY_ROWID+"="+l,null);
    db.close();
    }
}
