package com.dyhia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class exo8 extends AppCompatActivity implements View.OnClickListener{
    EditText villedepart, villearrive;
    Button bok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_exo8 );
        villearrive = (EditText) findViewById(R.id.etvillearrive);
        villedepart= findViewById( R.id.etvilledepart );
        bok= findViewById( R.id.bok );
        bok.setOnClickListener( this );


    }

    @Override
    public void onClick(View v) {
        if (v== bok){
            if ((villedepart.getText().toString()).equals( "marseille" ) && (villearrive.getText().toString()).equals( "montpellier" )){
                Intent ifiche = new Intent(this, Marseille_montpellier.class);
            }else if ((villedepart.getText().toString()).equals( "paris" ) && (villearrive.getText().toString()).equals( "lyon" )){
                Intent ifiche = new Intent(this, parislyon.class);
            }

        }

    }

}
