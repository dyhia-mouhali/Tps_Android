package com.example.tp2exo3fichier;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

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

                String nom= etnomcontact.getText().toString();
              String prenom=   etprenom.getText().toString();
             String numero=   ettelphone.getText().toString();
                String fileContentStr= nom+"_"+prenom+"_"+numero;
                try {

                    FileOutputStream fos= openFileOutput(fileContentStr, Context.MODE_PRIVATE);
                    // Open the writer
                    OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fos);
                    // Write
                    outputStreamWriter.write(fileContentStr);
                    // Close streams
                    outputStreamWriter.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                imain.putExtras(bundle);
                startActivity(imain);

            }

        });

    }
}
