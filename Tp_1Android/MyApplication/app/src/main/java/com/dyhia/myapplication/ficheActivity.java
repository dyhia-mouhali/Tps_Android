package com.dyhia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ficheActivity extends AppCompatActivity {
    TextView tvnom, tvprenom, tvage, tvdomaine, tvnumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fiche );

        tvnom= (TextView) findViewById(R.id.tvnompoint);
        tvnom.setText(getIntent().getStringExtra("nom"));
        tvprenom= (TextView) findViewById(R.id.tvprenompoint);
        tvprenom.setText(getIntent().getStringExtra("prenom"));

        tvage = (TextView) findViewById(R.id.tvagepoint);
        tvage.setText(getIntent().getStringExtra("age"));
        tvdomaine= (TextView) findViewById(R.id.tvdomainepoint);
        tvdomaine.setText(getIntent().getStringExtra("domaine"));

        tvnumero= (TextView) findViewById(R.id.tvnumerotelpoint);
        tvnumero.setText(getIntent().getStringExtra("numerotel"));


    }
}
