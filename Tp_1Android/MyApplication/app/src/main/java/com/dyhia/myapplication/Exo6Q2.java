package com.dyhia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exo6Q2 extends AppCompatActivity implements View.OnClickListener {

    TextView tvnom, tvprenom, tvage, tvdomaine, tvnumero;
    Button bok,bretour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_exo6_q2 );
        tvnom= (TextView) findViewById(R.id.tvnomp);
        tvnom.setText(getIntent().getStringExtra("nom"));
        tvprenom= (TextView) findViewById(R.id.tvpreomp);
        tvprenom.setText(getIntent().getStringExtra("prenom"));

        tvage = (TextView) findViewById(R.id.tvagep);
        tvage.setText(getIntent().getStringExtra("age"));
        tvdomaine= (TextView) findViewById(R.id.tvdomainep);
        tvdomaine.setText(getIntent().getStringExtra("domaine"));

        tvnumero= (TextView) findViewById(R.id.tvnump);
        tvnumero.setText(getIntent().getStringExtra("numerotel"));
        bok= findViewById( R.id.bok );
        bok.setOnClickListener( this );
        bretour= findViewById( R.id.bretour);
        bretour.setOnClickListener( this );



    }



    @Override
    public void onClick(View v) {

        if (v==bok){
            Intent i7 = new Intent(this, Exo7.class);
            i7.putExtra("numerotel", tvnumero.getText().toString());
            startActivity(i7);
        }else if(v==bretour){
            Intent i6 = new Intent(this,Exo6.class);
            startActivity( i6 );
        }

    }
}
