package com.example.application_vente.dataBase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.application_vente.object.Boutique;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateBaseManager extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "Gane.db";
    private static final int DATABASE_VERSION = 1;

    public DateBaseManager( Context context){
        super(context,DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String strSql = "create table T_Boutique ("
                + "    idBoutique integer primary key autoincrement,"
                + "    name text not null,"
                + "    article text not null,"
                + "    city text not null"
                + ")";
        db.execSQL( strSql );
        Log.i( "DATABASE", "onCreate invoked" );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String strSql = "drop table T_Boutique";
        db.execSQL( strSql );
        this.onCreate( db );
        Log.i( "DATABASE", "onUpgrade invoked" );

    }

    public void insertBoutique ( String name , String city ){
        name = name.replace( "'", "''" );
        String strSql = "insert into T_Boutique (name, city , article) values ('"
                + name + "', " + city + ", " + ")";
        this.getWritableDatabase().execSQL( strSql );
        Log.i( "DATABASE", "insertBoutique invoked" );
    }

    public List<Boutique> read() {
        List<Boutique> boutiques = new ArrayList<>();

        Cursor cursor = this.getReadableDatabase().query( "T_Boutique",
                new String[] { "id", "name", "article", "city" },
                null, null, null, null, "alphabétique " , "100" );
        cursor.moveToFirst();
        while( ! cursor.isAfterLast() ) {
            Boutique boutique = new Boutique( cursor.getInt( 0 ), cursor.getString( 1 ),
                    cursor.getInt( 2 ), new Date( cursor.getLong( 3 ) ) );
            boutiques.add( boutique );
            cursor.moveToNext();
        }
        cursor.close();

        return boutiques;
    }
}
