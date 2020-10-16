package com.dyhia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exo6 extends AppCompatActivity implements View.OnClickListener {
    Button bvalider, bexo6q2;
    EditText etnom, etprenom, etage ,etdomaine, etnumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout. activity_exo6);

        etnom = (EditText) findViewById(R.id.ednom);
        etprenom = (EditText) findViewById(R.id.edprenom);
        etage = findViewById( R.id.edage );
        etdomaine = (EditText) findViewById(R.id.eddomaine);
        etnumero= (EditText) findViewById(R.id.edtel);
        bvalider=(Button) findViewById(R.id.bvalider);
        bvalider.setOnClickListener(this);
        bexo6q2= findViewById( R.id.bexo6Q2 );
        bexo6q2.setOnClickListener( this );

    }

    @Override
    public void onClick(View v) {
        if (v== bvalider) {
            Intent ifiche = new Intent(this, ficheActivity.class);
            ifiche.putExtra("nom", etnom.getText().toString());
            ifiche.putExtra("prenom", etprenom.getText().toString());
            ifiche.putExtra("age", etage.getText().toString());
            ifiche.putExtra("domaine", etdomaine.getText().toString());
            ifiche.putExtra("numerotel", etnumero.getText().toString());
            startActivity(ifiche);

        }else if (v== bexo6q2){
            Intent ifiche = new Intent(this, Exo6Q2.class);
            ifiche.putExtra("nom", etnom.getText().toString());
            ifiche.putExtra("prenom", etprenom.getText().toString());
            ifiche.putExtra("age", etage.getText().toString());
            ifiche.putExtra("domaine", etdomaine.getText().toString());
            ifiche.putExtra("numerotel", etnumero.getText().toString());
            startActivity(ifiche);

        }
        }


}
