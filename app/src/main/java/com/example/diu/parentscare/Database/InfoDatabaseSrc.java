package com.example.diu.parentscare.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class InfoDatabaseSrc {

    private InfoDatabaseHelper helper;
    private SQLiteDatabase db;

    public InfoDatabaseSrc(Context context){
        helper = new InfoDatabaseHelper(context);
    }
    public void open(){
        db = helper.getWritableDatabase();
    }
    public void close(){
        db.close();
    }

    public boolean insertInfo(Info info){
        this.open();
        ContentValues values = new ContentValues();
        values.put(InfoDatabaseHelper.INFO_COL_NAME,info.getName());
        values.put(InfoDatabaseHelper.INFO_COL_RELATION,info.getRelation());
        values.put(InfoDatabaseHelper.INFO_COL_MOB_NUM,info.getMob_num());
        values.put(InfoDatabaseHelper.INFO_COL_EMAIL,info.getEmail());

        long insertedRow = db.insert(InfoDatabaseHelper.TABLE_INFO,null,values);

        if (insertedRow>0){
            return true;
        }else {
            return false;
        }

    }
}
