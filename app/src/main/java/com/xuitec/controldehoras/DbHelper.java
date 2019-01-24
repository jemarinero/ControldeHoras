package com.xuitec.controldehoras;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "WORKING_HOURS";

    private static final int DATABASE_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        ctEmpleador(db);
        ctLog(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS EMPLEADOR");
        db.execSQL("DROP TABLE IF EXISTS LOG");
        ctEmpleador(db);
        ctLog(db);
    }

    private void ctEmpleador(SQLiteDatabase db){
        String query = "CREATE TABLE EMPLEADOR ("
                + " _id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " NOMBRE TEXT,"
                + " PRECIO_HR NUMERIC(9,2)"
                + " )";

        try {
            db.execSQL(query);
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void ctLog(SQLiteDatabase db){
        String query = "CREATE TABLE LOG ("
                + " _id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " EMPLEADOR INTEGER,"
                + " HORAS INTEGER"
                + " )";

        try {
            db.execSQL(query);
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
