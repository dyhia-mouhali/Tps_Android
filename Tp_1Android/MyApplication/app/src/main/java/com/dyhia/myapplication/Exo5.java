package com.dyhia.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Exo5 extends AppCompatActivity implements  OnClickListener{
    private Button bvalider;
    private Exo5 exo5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_exo5 );
        bvalider=(Button) findViewById(R.id.bvalider);
        bvalider.setOnClickListener( this );

    }

    @Override
    public void onClick(View v) {
        if (v== bvalider) {

            AlertDialog.Builder mypopup = new AlertDialog.Builder(  exo5);
            mypopup.setTitle( "validation " );
            mypopup.setMessage( "voules vous vraiment Valider" );
            mypopup.setPositiveButton( "OUI", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText( getApplicationContext(), "vous avez valider" , Toast.LENGTH_SHORT).show();
                }
            } );
            mypopup.setNegativeButton( "NON", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText( getApplicationContext(), "vous avez annuler" , Toast.LENGTH_SHORT).show();
                }
            } );
        }
    }
}
