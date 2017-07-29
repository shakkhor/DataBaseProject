package com.example.shakkhor.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by shakkhor on 7/23/17.
 */

public class MakeDatabase  extends SQLiteOpenHelper {

    private static final int Database_Version = 1;
    SQLiteDatabase db;
    public static final String Database_Name = "Medicine.db";

    public static final String Table1  = "User";
    public static final String T1_Col1 = "User_ID";
    public static final String T1_Col2 = "User_Name";
    public static final String T1_Col3 = "User_Email";
    public static final String T1_Col4 = "User_Password";


    public static final String Table2  = "Drugs";
    public static final String T2_Col1 = "Drug_ID";
    public static final String T2_Col2 = "Drug_Name";
    public static final String T2_Col3 = "Drug_Genre";
    public static final String T2_Col4 = "Drug_Form";
    public static final String T2_Col5 = "Drug_Strength";
    public static final String T2_Col6 = "Drug_Company";
    public static final String T2_Col7 = "Drug_Indication";
    public static final String T2_Col8 = "Drug_Class";


    public static final String Table3  = "Class";
    public static final String T3_Col1 = "Class_ID";
    public static final String T3_Col2 = "Class_Name";


    public static final String Table4  = "Company";
    public static final String T4_Col1 = "Company_ID";
    public static final String T4_Col2 = "Company_Name";
    public static final String T4_Col3 = "Company_Class";
    public static final String T4_Col4 = "Company_Genre";
    public static final String T4_Col5 = "Company_Indication";

    public static final String Table5  = "Genre";
    public static final String T5_Col1 = "Genre_ID";
    public static final String T5_Col2 = "Genre_Name";

    public static final String Table6  = "Favorite";
    public static final String T6_Col1 = "User_ID";
    public static final String T6_Col2 = "Drug_ID";

    public static final String Table7  = "Indication";
    public static final String T7_Col1 = "Indication_ID";
    public static final String T7_Col2 = "Indiacation_Name";




    public MakeDatabase(Context context ) {
        super(context, Database_Name, null, Database_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " +Table1 + " (User_ID INTEGER PRIMARY KEY, User_Name TEXT, User_Email TEXT, User_Password TEXT)");
        db.execSQL("create table " +Table2 + " (Drug_ID INTEGER PRIMARY KEY AUTOINCREAMENT, Drug_Name TEXT, Drug_Genre INTEGER, Drug_Form TEXT, Drug_Strength TEXT, Drug_Company INTEGER, Drug_Indication INTEGER, Drug_Class INTEGER)");
        db.execSQL("create table " +Table3 + " (Class_ID INTEGER PRIMARY KEY AUTOINCREAMENT, Class_Name TEXT)");
        db.execSQL("create table " +Table4 + " (Company_ID INTEGER PRIMARY KEY AUTOINCREAMENT, Company_Name TEXT, Company_Class INTEGER, Company_Genre INTEGER, Company_Indication INTEGER)");
        db.execSQL("create table " +Table5 + " (Genre_ID INTEGER PRIMARY KEY AUTOINCREAMENT, Genre_Name TEXT)");
        db.execSQL("create table " +Table6 + " (User_ID INTEGER, Drug_ID INTEGER)");
        db.execSQL("create table " +Table7 + " (Indication_ID PRIMARY KEY AUTOINCREAMENT, Indication_Name TEXT)");
        this.db = db;
    }

    public void insertUserDetails(User c){
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from " + Table1;
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(T1_Col1,count);
        values.put(T1_Col2, c.getUname());
        values.put(T1_Col3, c.getEmail());
        values.put(T1_Col4, c.getPass());

        db.insert(Table1, null, values);

        db.close();
    }

    public String searchPass(String uname){
        db = this.getReadableDatabase();

        String query = "select User_Name, User_Password from " + Table1;
        Cursor cursor = db.rawQuery(query, null);
        String a,b;
        b = "not found";
        if(cursor.moveToFirst()){
            do{
                a = cursor.getString(0);
                if(a.equals(uname)){
                    b = cursor.getString(1);
                    break;
                }
            }while(cursor.moveToNext());
        }

        return b;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS "+Table1;
        db.execSQL(query);
        this.onCreate(db);
    }
}
