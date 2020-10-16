package com.example.tp2exo4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AjoutActivity extends AppCompatActivity {
    EditText ettelphone, etnomcontact, etprenom;
    Button bajouter ;
    BDDcontact bddcontact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout);
        etnomcontact=findViewById(R.id.etnom);
        etprenom=findViewById(R.id.etprenom);
        ettelphone= findViewById(R.id.etnumertel);
        bddcontact= new BDDcontact(this);
        bajouter=findViewById(R.id.bajouter);
        bajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               Intent imain= new Intent(getApplicationContext(), MainActivity.class);
                String nom= etnomcontact.getText().toString();
                String prenom= etprenom.getText().toString();
                String numero = ettelphone.getText().toString();
                Contacte ct=new Contacte( nom, prenom, numero);
                bddcontact.ajoutContact(ct);
                Toast.makeText(getApplicationContext(), "ajout reussi", Toast.LENGTH_LONG).show();
                startActivity(imain);

            }

        });

    }
}
