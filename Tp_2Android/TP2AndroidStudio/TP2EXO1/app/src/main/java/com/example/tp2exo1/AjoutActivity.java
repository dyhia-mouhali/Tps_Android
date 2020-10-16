package com.example.tp2exo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AjoutActivity extends AppCompatActivity {
    EditText ettelphone, etnomcontact, etprenom;
    Button bajouter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout);
        etnomcontact=(EditText)findViewById(R.id.etnom);
        etprenom=findViewById(R.id.etprenom);
        ettelphone= findViewById(R.id.etnumertel);
        bajouter=findViewById(R.id.bajouter);
        bajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               Intent imain= new Intent(getApplicationContext(), MainActivity.class);
                Bundle bundle = new Bundle();
                imain.putExtra("nom", etnomcontact.getText().toString());
                imain.putExtra("prenom", etprenom.getText().toString());
                imain.putExtra("numero", ettelphone.getText().toString());
                imain.putExtras(bundle);
                startActivity(imain);

            }

        });

    }
}
