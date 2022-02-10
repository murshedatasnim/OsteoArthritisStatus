package com.example.osteoarthritisstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;

public class clinicalinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinicalinfo);

        ImageView back = findViewById(R.id.backclinical);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dashboard.class));
                finish();
            }
        });

        Button submit = findViewById(R.id.saveclinical);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),dashboard.class));
                finish();
            }
        });

        //-------q3p1------------//
        MaterialAutoCompleteTextView q3p1 = (MaterialAutoCompleteTextView) findViewById(R.id.q3p1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q3p1Adapter = ArrayAdapter
                .createFromResource(this, R.array.q3p1array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q3p1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q3p1.setAdapter(q3p1Adapter);

        //-------q10------------//
        MaterialAutoCompleteTextView q10 = (MaterialAutoCompleteTextView) findViewById(R.id.q10);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q10Adapter = ArrayAdapter
                .createFromResource(this, R.array.q10array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q10Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q10.setAdapter(q10Adapter);


        //-------q12p1------------//
        MaterialAutoCompleteTextView q12p1 = (MaterialAutoCompleteTextView) findViewById(R.id.q12p1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q12p1Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q12p1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q12p1.setAdapter(q12p1Adapter);


        //-------q14p1------------//
        MaterialAutoCompleteTextView q14p1 = (MaterialAutoCompleteTextView) findViewById(R.id.q14p1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q14p1Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q14p1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q14p1.setAdapter(q14p1Adapter);


        //-------q15p1------------//
        MaterialAutoCompleteTextView q15p1 = (MaterialAutoCompleteTextView) findViewById(R.id.q15p1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q15p1Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q15p1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q15p1.setAdapter(q15p1Adapter);

        //-------q15p2------------//
        MaterialAutoCompleteTextView q15p2 = (MaterialAutoCompleteTextView) findViewById(R.id.q15p2);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q15p2Adapter = ArrayAdapter
                .createFromResource(this, R.array.q15array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q15p2Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q15p2.setAdapter(q15p2Adapter);


        //-------q17p1------------//
        MaterialAutoCompleteTextView q17p1 = (MaterialAutoCompleteTextView) findViewById(R.id.q17p1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> q17p1Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        q17p1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        q17p1.setAdapter(q17p1Adapter);


    }
}