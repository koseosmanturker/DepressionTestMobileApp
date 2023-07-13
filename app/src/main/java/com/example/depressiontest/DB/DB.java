package com.example.depressiontest.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.depressiontest.Entity.Result;

import java.util.ArrayList;

public class DB extends SQLiteOpenHelper {

    private final static String databaseName = "ResultsDB";
    private final static int databaseVersion = 1;
    private String RESULT_TABLE = "Results";
    private static DB dbInstance = null;

    public synchronized static DB getInstance(Context context)
    {
        if(dbInstance == null)
        {
            dbInstance = new DB(context.getApplicationContext());
        }
        return dbInstance;
    }

    public DB(Context context)
    {

        super(context,databaseName,null,databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createQuery = "CREATE TABLE " + RESULT_TABLE + " ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " result TEXT"
                + " )";

        sqLiteDatabase.execSQL(createQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }

    public void addNewResult(String result)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("result",result);

        sqLiteDatabase.insert(RESULT_TABLE,null,contentValues);

        sqLiteDatabase.close();

    }

    public ArrayList<Result> getAllResults()
    {
        ArrayList<Result> contactsArrayList = new ArrayList<>();

        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();

        Cursor cursor = sqLiteDatabase.query(RESULT_TABLE,null,null,null,null,null,null);

        if(cursor.moveToFirst())
        {
            do {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                String resultNum = cursor.getString(cursor.getColumnIndexOrThrow("result"));

                Result result = new Result(id,resultNum);

                contactsArrayList.add(result);



            }
            while(cursor.moveToNext());
        }


        return contactsArrayList;
    }


    public Result getResult(int id)
    {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();

        Cursor cursor = sqLiteDatabase.query(RESULT_TABLE,null,"id= ? " ,new String[]{ String.valueOf(id) },null,null,null);
        //Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + CONTACT_TABLE + " WHERE id = " + id,null);

        Result result = null;

        if(cursor.moveToFirst())
        {
            do {
                int userId = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                String resultNum = cursor.getString(cursor.getColumnIndexOrThrow("result"));

                result = new Result(userId,resultNum);

            }
            while(cursor.moveToNext());
        }

        return result;
    }

}
