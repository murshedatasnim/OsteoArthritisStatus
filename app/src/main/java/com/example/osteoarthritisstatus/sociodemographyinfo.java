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



        //-------s1------------//
        MaterialAutoCompleteTextView s1 = (MaterialAutoCompleteTextView) findViewById(R.id.s1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> s1Adapter = ArrayAdapter
                .createFromResource(this, R.array.s1array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        s1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        s1.setAdapter(s1Adapter);


        //-------s2------------//
        MaterialAutoCompleteTextView s2 = (MaterialAutoCompleteTextView) findViewById(R.id.s2);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> s2Adapter = ArrayAdapter
                .createFromResource(this, R.array.s2array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        s2Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        s2.setAdapter(s2Adapter);


        //-------s3------------//
        MaterialAutoCompleteTextView s3 = (MaterialAutoCompleteTextView) findViewById(R.id.s3);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> s3Adapter = ArrayAdapter
                .createFromResource(this, R.array.s3array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        s3Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        s3.setAdapter(s3Adapter);


        //-------s4------------//

        //--------s5----------//
        MaterialAutoCompleteTextView s5 = (MaterialAutoCompleteTextView) findViewById(R.id.s5);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> s5Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        s5Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        s5.setAdapter(s5Adapter);


        //-------s6------------//
        MaterialAutoCompleteTextView s6 = (MaterialAutoCompleteTextView) findViewById(R.id.s6);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> s6Adapter = ArrayAdapter
                .createFromResource(this, R.array.s6array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        s6Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        s6.setAdapter(s6Adapter);


        //-------s7------------//
        MaterialAutoCompleteTextView s7 = (MaterialAutoCompleteTextView) findViewById(R.id.s7);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> s7Adapter = ArrayAdapter
                .createFromResource(this, R.array.s7array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        s7Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        s7.setAdapter(s7Adapter);


    }
}