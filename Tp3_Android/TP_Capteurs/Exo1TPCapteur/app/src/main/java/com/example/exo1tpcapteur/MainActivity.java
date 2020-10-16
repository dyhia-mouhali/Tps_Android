package com.example.exo1tpcapteur;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    // The sensor manager
    SensorManager sensorManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
        // Instanicer le SensorManager
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
       List<Sensor> sensors= sensorManager.getSensorList(Sensor.TYPE_ALL);
for (Sensor sensor: sensors){
    Log.i("Debug", sensor.getName()+"-------"+sensor.getFifoMaxEventCount());
    // en vas en bas vers la la fenêtre logcat en filtre au niveau de la  rechercher Debug sa va nous afficher les capteurs
}
    }




}

