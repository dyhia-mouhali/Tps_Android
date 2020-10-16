package com.example.tp2exo4;

import android.os.Bundle;

import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView lvcontact;
    BDDcontact bc;
    AdaptateurPersonalise adapt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //la liste des contacts a affiche sur la listeview
      // ArrayList<Contacte> lcontact=new ArrayList<Contacte>();
       // bc=new BDDcontact(this);
     //   lcontact= bc.getContact();
     //   adapt=new AdaptateurPersonalise(this, R.layout.list_item, lcontact);
       // lvcontact = (ListView) findViewById(R.id.list);
   //     lvcontact.setAdapter(adapt);


    }
    @Override
    protected void onResume() {

        super.onResume();
        //la liste des contacts a affiche sur la listeview
        List<Contacte> lcontact= new ArrayList<Contacte>();
        bc=new BDDcontact(this);
        lcontact= bc.getContact();
        adapt=new AdaptateurPersonalise(this, R.layout.list_item, lcontact);
        lvcontact = findViewById(R.id.list);
        lvcontact.setAdapter(adapt);

    }

}



