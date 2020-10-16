package com.dyhia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Exo3CodeJava extends AppCompatActivity {
    private LinearLayout myleaout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
       setContentView( R.layout.activity_exo3java);
        this.myleaout = findViewById( R.id.mydynamicLayout );



        LinearLayout lnom = new LinearLayout( this );
        lnom.setOrientation( LinearLayout.HORIZONTAL );
        myleaout.addView( lnom );
        TextView tnom = new TextView( this );
        tnom.setText( "Nom:" );
        tnom.setTextSize( 15 );
        EditText enom = new EditText( this );
        lnom.addView( tnom );
        lnom.addView( enom );

        LinearLayout lprenom = new LinearLayout( this );
        lprenom.setOrientation( LinearLayout.HORIZONTAL );
        myleaout.addView( lprenom );
        TextView tprenom = new TextView( this );
        tprenom.setText( "prenom:" );
        tprenom.setTextSize( 15 );
        EditText eprenom = new EditText( this );
        lprenom.addView( tprenom );
        lprenom.addView( eprenom );

        LinearLayout ldomaine= new LinearLayout( this );
        ldomaine.setOrientation( LinearLayout.HORIZONTAL );
        myleaout.addView( ldomaine );
        TextView tdomaine = new TextView( this );
        tdomaine.setText( "Domaine :" );
        tdomaine.setTextSize( 15 );
        EditText edomaine= new EditText( this );
        ldomaine.addView( tdomaine );
        ldomaine.addView( edomaine );

        LinearLayout ltel = new LinearLayout( this );
        ltel.setOrientation( LinearLayout.HORIZONTAL );
        myleaout.addView( ltel );
        TextView ttel = new TextView( this );
        ttel.setText( "numero de tel:" );
        ttel.setTextSize( 15 );
        EditText etel = new EditText( this );
        ltel.addView( ttel );
        ltel.addView( etel );

        LinearLayout lbutton = new LinearLayout( this );
        lbutton.setOrientation( LinearLayout.HORIZONTAL );
        myleaout.addView(lbutton  );
        Button bvalider = new Button( this );
        bvalider.setText( "Valider" );
        lbutton.addView( bvalider );



    }


}
