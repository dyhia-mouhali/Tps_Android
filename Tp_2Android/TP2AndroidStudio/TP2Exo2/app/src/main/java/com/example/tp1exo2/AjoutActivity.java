package com.example.tp1exo2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AjoutActivity extends AppCompatActivity {
    EditText ettelphone, etnomcontact, etprenom;
    Button bajouter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            String EtatContact;
            EtatContact  = savedInstanceState.getString("Contact_STATE_KEY");
        }
        setContentView(R.layout.activity_ajout);
        etnomcontact=(EditText)findViewById(R.id.etnom);
        etprenom=findViewById(R.id.etprenom);
        ettelphone= findViewById(R.id.etnumertel);

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        String nomm= sharedPreferences.getString("nomstr","");
        String prenomm= sharedPreferences.getString("prenomstr","");
        String nnumeroo= sharedPreferences.getString("numerostr","");
        etnomcontact.setText(nomm);
        etprenom.setText(prenomm);
        ettelphone.setText(nnumeroo);
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
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
       etnomcontact.setText(savedInstanceState.getString("TEXT_VIEW_KEY"));
        etprenom.setText(savedInstanceState.getString("TEXT_VIEW_KEYp"));
        ettelphone.setText(savedInstanceState.getString("TEXT_VIEW_KEYnu"));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState . putString ( "Contact_STATE_KEY", "EtatContact");
        outState.putString("TEXT_VIEW_KEY", String.valueOf(etnomcontact.getText()));
        outState . putString ( "TEXT_VIEW_KEYp" , String.valueOf(etprenom.getText ()));
        outState . putString ( "TEXT_VIEW_KEYnu" , String.valueOf(ettelphone.getText ()));
        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }
    public void AJOUTER(View view){
              String prenomstr = etprenom.getText().toString();
              String nomstr= etnomcontact.getText().toString();
              String numstr= ettelphone.getText().toString();

        SharedPreferences sharedPreferences= getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();


        editor.putString("nomstr",nomstr);
        editor.putString("prenomstr",prenomstr);
        editor.putString("numerostr", numstr);

        editor.apply();
    }

}

