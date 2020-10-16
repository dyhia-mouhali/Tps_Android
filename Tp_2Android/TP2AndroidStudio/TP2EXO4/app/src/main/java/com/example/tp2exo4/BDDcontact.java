package com.example.tp2exo4;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class BDDcontact extends SQLiteOpenHelper {
    String reqtable = "create table contacts(nom varchar(25), prenom varchar(25), numero varchar(16))";
    String suptable = "drop table contacts";

    public BDDcontact(Context context) {
        super(context, "BseContact", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(reqtable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        db.execSQL(suptable);
        onCreate(db);
    }

    // methodde d'insertation d'un tuble
    public void ajoutContact(Contacte c) {
        // consulte la bdd en mode ecriture
        SQLiteDatabase bdd=this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nom", c.getNom());
        values.put("prenom",c.getPrenom());
        values.put("numero", c.getNumero());

        bdd.insert("contacts", null, values);

    }
    // affiche tt les tubles de contacts
    public ArrayList<Contacte> getContact() {
        ArrayList< Contacte> listecontacts= new ArrayList<Contacte>();

        String reqselect="select * from contacts";
        SQLiteDatabase bdd = this.getReadableDatabase();
        Cursor cur=bdd.rawQuery(reqselect, null);
        // parcourire le cursor tuple par tuple et transforme chaque tuple en contact et l'ajoute au arraylist
        if (cur.moveToFirst()) {
            do {

                String nom= cur.getString(0);
                String prenom = cur.getString(1);
                String numero = cur.getString(2);
                Contacte cont = new Contacte( nom, prenom, numero);
                listecontacts.add(cont);
            } while (cur.moveToNext());
        }
        return listecontacts;
    }


    /*// methode de supprission d'un contact
    public void suppContact(int id) {
        SQLiteDatabase bdd=this.getWritableDatabase();
        bdd.delete("contacts", "id="+id, null);
    }
    public void modifiCOnt(Contacte cn,int id) {
        ContentValues valeur= new ContentValues();
        cn=new Contacte();
        valeur.put("nom", cn.getNom());
        valeur.put("prenom", cn.getPrenom());
        valeur.put("numero", cn.getNumero());
        SQLiteDatabase bdd= this.getWritableDatabase();
        bdd.update("contacts", valeur, "id="+id, null);
    }*/

}
