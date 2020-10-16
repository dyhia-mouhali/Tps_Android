package com.example.tp2exo3fichier;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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


        adapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.txtview,itemList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fileList());
        ListView listV=(ListView)findViewById(R.id.list);
        listV.setAdapter(adapter);


// Instanciate the first element
        String fileName = (String) listV.getSelectedItem();

// if there is a selected file, then read it
        if (fileName != null) {
            try {
                //open the file and retrieve the inputStream
                InputStream inputStream = openFileInput(fileName);
                if (inputStream != null) {
                    // open a reader on the inputStream
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                    // String to use to store read lines
                    String str;
                    StringBuilder buf = new StringBuilder();

                    // Read the file
                    while ((str = reader.readLine()) != null) {
                        buf.append(str + "\r\n");
                    }
                    // Close the reader
                    reader.close();
                    // Close the inputStream
                    inputStream.close();
                    // Affect the text to the textView
                    txtnewcontact.setText(buf.toString());
                    String newItem=txtnewcontact.getText().toString();
                    // add new item to arraylist
                    itemList.add(newItem);
                    // notify listview of data changed
                    adapter.notifyDataSetChanged();
                }
            } catch (java.io.FileNotFoundException e) {
                Toast.makeText(this, "FileNotFoundException", Toast.LENGTH_LONG);
            } catch (IOException e) {
                Toast.makeText(this, "FileNotFoundException", Toast.LENGTH_LONG);
            }
        }


    }}
