package com.example.tp2exo4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class AdaptateurPersonalise extends ArrayAdapter<Contacte> {


    Activity context;
    public AdaptateurPersonalise(Activity context, int textViewResourceId,
                                 List<Contacte> listContact) {
        super(context, R.layout.list_item, listContact);
        this.context=context;
    }
    // creation de la vue personalise
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li=context.getLayoutInflater();
        View vuep=li.inflate(R.layout.list_item, null);

        TextView tvnom=(TextView) vuep.findViewById(R.id.tvnomcontacte);
        TextView tvprenom =(TextView) vuep.findViewById(R.id.tvprenomconact);
        TextView tvnumero= (TextView) vuep.findViewById(R.id.tvnumeroconact );

        Contacte contactcourant= getItem(position);
        tvnom.setText(contactcourant.getNom());
        tvprenom.setText(contactcourant.getPrenom());
        tvnumero.setText(contactcourant.getNumero());

        return vuep;
    }

}

