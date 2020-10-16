package com.example.tp2exo5;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ServiceContact extends Service {
    BDDcontact bddcontact = new BDDcontact(this);
    int i, j;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        ArrayList< Contacte> listecontacts= new ArrayList<Contacte>();
        ArrayList contactfich= new ArrayList();
        listecontacts= bddcontact.getContact();

        String fileName = "";

            try {

                InputStream inputStream = openFileInput(fileName);
                if (inputStream != null) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    }
                } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }

        for( i=0;  i <listecontacts.size();i++ ){
            for(j=0; j<contactfich.size(); j++){
              //parcourirs les deux array liste et ajout dans le cas ou en trouve pas legalite

            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
