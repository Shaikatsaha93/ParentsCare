package com.example.diu.parentscare.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class InfoDatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "info_db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_INFO = "tbl_info";
    public static final String INFO_COL_ID = "info_id";
    public static final String INFO_COL_NAME = "info_name";
    public static final String INFO_COL_RELATION = "info_relation";
    public static final String INFO_COL_MOB_NUM = "info_mob_num";
    public static final String INFO_COL_EMAIL = "info_email";

    public static final String CREATE_TABLE_INFO = "CREATE TABLE "+TABLE_INFO+" ( "+INFO_COL_ID+ " INTEGER PRIMARY KEY, "+INFO_COL_NAME+ " TEXT, "+ INFO_COL_RELATION+ " TEXT, "+INFO_COL_MOB_NUM+ " INTEGER, "+INFO_COL_EMAIL+ " TEXT );";

    public InfoDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_INFO);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_INFO);
        onCreate(db);

    }
}
