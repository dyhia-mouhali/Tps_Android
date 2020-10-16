package com.example.tp2exo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> itemList;
    ArrayAdapter<String> adapter;
    TextView txtnewcontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String strnom = "";
        String strprenom = "";
        String strnumero = "";
        String[] items={"Dyhia_mouhali_00000","Sandra_djafer_00000","Seriai_abdelhak_99999"};
        itemList=new ArrayList<String>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.txtview,itemList);
        ListView listV=(ListView)findViewById(R.id.list);
        listV.setAdapter(adapter);

        txtnewcontact= (TextView) findViewById(R.id.txtnewcontact);
        //txtnewcontact.setText(getIntent().getStringExtra("nvcontact"));
        if (intent.hasExtra("nom")){ // vérifie qu'une valeur est associée à la clé “nom”
            strnom = intent.getStringExtra("nom"); // on récupère la valeur associée à la clé
        }
        if (intent.hasExtra("prenom")){ // vérifie qu'une valeur est associée à la clé “prenom”
            strprenom = intent.getStringExtra("prenom"); // on récupère la valeur associée à la clé
        }
        if (intent.hasExtra("numero")){ // vérifie qu'une valeur est associée à la clé “numero”
            strnumero = intent.getStringExtra("numero"); // on récupère la valeur associée à la clé
        }
        txtnewcontact.setText(strnom +"_"+strprenom+"_"+strnumero+"; " );
        String newItem=txtnewcontact.getText().toString();
        // add new item to arraylist
        itemList.add(newItem);
        // notify listview of data changed
        adapter.notifyDataSetChanged();

    }
}
