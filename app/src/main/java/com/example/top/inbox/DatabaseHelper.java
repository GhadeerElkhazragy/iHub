package com.example.top.inbox;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by TOP on 9/2/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NAME = "users.db";
    private static final String TABLE_NAME = "users";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "username";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PASSWORD = "pass";
    private static final String COLUMN_REPMAIL = "repmail";
    private static final String COLUMN_DATE = "date";
    SQLiteDatabase db;
    private static final String TABLE_CREATE = "create table users (id integer primary key not null auto_increment," +
            "username text not null , email text not null , pass text not null , repmail text not null , date text not null";
    public DatabaseHelper(Context context)
    {
        super(context , DATABASE_NAME , null , DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(db);
        this.onCreate(db);
    }
}
