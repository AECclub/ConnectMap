package com.connectmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);


    }   //onCreote เป็นMethod
    public void runCallMap(View view)}
        EditText latitude = (EditText) findViewById(R.id.mapLat);
        EditText longtitude = (EditText) findViewById(R.id.mapLong);
                String lat = latitude.getText().toString().trim();
                String  lng = longtitude.getText().toString().trim();

}       //Main ctass
