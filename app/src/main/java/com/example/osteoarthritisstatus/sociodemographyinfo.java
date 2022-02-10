package com.example.osteoarthritisstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;

public class sociodemographyinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociodemographyinfo);

        ImageView back = findViewById(R.id.backsocio);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dashboard.class));
                finish();
            }
        });

        Button submit = findViewById(R.id.savesocioinfo);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),dashboard.class));
                finish();
            }
        });



        //-------q6p1------------//
        MaterialAutoCompleteTextView q6p1 = (MaterialAutoCompleteTextView) findViewById(R.id.q6p1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q6p1Adapter = ArrayAdapter
                .createFromResource(this, R.array.q6p1array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q6p1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q6p1.setAdapter(q6p1Adapter);


        //-------q6p2------------//
        MaterialAutoCompleteTextView q6p2 = (MaterialAutoCompleteTextView) findViewById(R.id.q6p2);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q6p2Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q6p2Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q6p2.setAdapter(q6p2Adapter);


        //-------q7p1------------//
        MaterialAutoCompleteTextView q7p1 = (MaterialAutoCompleteTextView) findViewById(R.id.q7p1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q7p1Adapter = ArrayAdapter
                .createFromResource(this, R.array.q7array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q7p1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q7p1.setAdapter(q7p1Adapter);


        //-------q8------------//
        MaterialAutoCompleteTextView q8 = (MaterialAutoCompleteTextView) findViewById(R.id.q8);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q8Adapter = ArrayAdapter
                .createFromResource(this, R.array.q8array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q8Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q8.setAdapter(q8Adapter);


        //-------q9------------//
        MaterialAutoCompleteTextView q9 = (MaterialAutoCompleteTextView) findViewById(R.id.q9);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q9Adapter = ArrayAdapter
                .createFromResource(this, R.array.q9array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q9Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q9.setAdapter(q9Adapter);


        //-------q16p1------------//
        MaterialAutoCompleteTextView q16p1 = (MaterialAutoCompleteTextView) findViewById(R.id.q16p1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q16p1Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q16p1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q16p1.setAdapter(q16p1Adapter);


    }
}