package com.example.exoaccelom;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;


import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity  implements SensorEventListener{
    private TextView xText, yText, zText;
    private Sensor mySensor;
    private SensorManager SM;
    private LinearLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create our Sensor Manager
        SM = (SensorManager)getSystemService(SENSOR_SERVICE);

        // Accelerometer Sensor
        mySensor = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        // Register sensor Listener
        SM.registerListener(this, mySensor, SensorManager.SENSOR_DELAY_NORMAL);

        // Assign TextView
        xText = (TextView)findViewById(R.id.xText);
        yText = (TextView)findViewById(R.id.yText);
        zText = (TextView)findViewById(R.id.zText);

        l= findViewById(R.id.mon_layout);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        xText.setText("X: " + event.values[0]);
        yText.setText("Y: " + event.values[1]);
        zText.setText("Z: " + event.values[2]);
if(event.values[0]>=6300000 ||  event.values[1]>=6300000 ||  event.values[2]>=6300000){
//l.setBackgroundColor(630808);
l.setBackgroundColor(Color.parseColor("#FF0000"));
}else if(event.values[0]>=9.81 ||  event.values[1]>=9.81||  event.values[2]>=9.81){
    l.setBackgroundColor(Color.parseColor("#000000"));
}
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
