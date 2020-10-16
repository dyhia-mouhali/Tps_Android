package com.dyhia.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exo7 extends AppCompatActivity implements View.OnClickListener {
    TextView tvnumero;
    Button bappel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_exo7 );
        tvnumero= (TextView) findViewById(R.id.tvappel);
        tvnumero.setText(getIntent().getStringExtra("numerotel"));
        bappel= findViewById( R.id.bapp );
       bappel.setOnClickListener( this );

    }

    @Override
    public void onClick(View v) {
          if(v==bappel){

            Uri uri = Uri.parse("tel:" +tvnumero.getText().toString());
            Intent intent = new Intent( Intent.ACTION_DIAL, uri );
             startActivity(intent);
}
    }
}
