package com.example.connectivity_emp1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, EmpClass.DB_NAME,null,EmpClass.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL(EmpClass.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+EmpClass.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public long EmpInsert(String ename,int sal,int dno)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(EmpClass.EMP_NAME,ename);
        cv.put(EmpClass.EMP_SAL,sal);
        cv.put(EmpClass.EMP_DNO,dno);

        long id = db.insert(EmpClass.TABLE_NAME,null,cv);
        return id;
    }

    public Cursor Empsearch(int eno)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor c=db.rawQuery("select * from "+ EmpClass.TABLE_NAME+"where"+EmpClass.EMP_NO+"="+eno,null);
        return c;
    }


}
