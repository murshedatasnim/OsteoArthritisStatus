package com.example.osteoarthritisstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;

public class clinicalinfo extends AppCompatActivity {
    TextInputEditText c1, c2, c3, other_c6;
    MaterialAutoCompleteTextView c4, c5, c7;
//
//

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


        //---------------c1--------------//
        c1 = findViewById(R.id.c1);

        //---------------c2-------------//
        c2 = findViewById(R.id.c2);

        //---------------c3--------------//
        c3 = findViewById(R.id.c3);


        //-------c4------------//
        c4 = (MaterialAutoCompleteTextView) findViewById(R.id.c4);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c4Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c4Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c4.setAdapter(c4Adapter);

        //-------c5------------//
        c5 = (MaterialAutoCompleteTextView) findViewById(R.id.c5);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c5Adapter = ArrayAdapter
                .createFromResource(this, R.array.c5array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c5Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c5.setAdapter(c5Adapter);


        //--------c6---------//
        CheckBox pain,swelling,deformity,stiffness,movement;
        pain = findViewById(R.id.c6pain);
        swelling = findViewById(R.id.c6swelling);
        deformity = findViewById(R.id.c6Deformity);
        stiffness = findViewById(R.id.c6stiffness);
        movement = findViewById(R.id.c6movementrestriction);
        other_c6 = findViewById(R.id.c6other);


        //-------c7------------//
        MaterialAutoCompleteTextView c7 = (MaterialAutoCompleteTextView) findViewById(R.id.c7);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c7Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c7Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c7.setAdapter(c7Adapter);


        c7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                String selection = (String)parent.getItemAtPosition(position);
                //TODO Do something with the selected text

                if (selection.equals("Yes")){
//                    Toast.makeText(parent.getContext(), "You selected: " + selection,
//                            Toast.LENGTH_LONG).show();
                    LinearLayout linearLayout = findViewById(R.id.c7p2);
                    linearLayout.setVisibility(View.VISIBLE);
                }else if (selection.equals("No")){
                    LinearLayout linearLayout = findViewById(R.id.c7p2);
                    linearLayout.setVisibility(View.GONE);
                }
            }
        });

        CheckBox hip, ankle, smallJointOfFinger, baseOfThumbJoint, neckPain, backPain;
        hip = findViewById(R.id.c7hip);
        ankle = findViewById(R.id.c7ankle);
        smallJointOfFinger = findViewById(R.id.c7smalljointsoffinger);
        baseOfThumbJoint = findViewById(R.id.c7baseofthumbjoint);
        neckPain = findViewById(R.id.c7neckpain);
        backPain = findViewById(R.id.c7backpain);


        //-------c8------------//
        MaterialAutoCompleteTextView c8 = (MaterialAutoCompleteTextView) findViewById(R.id.c8);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c8Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c8Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c8.setAdapter(c8Adapter);

        c8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                String selection = (String)parent.getItemAtPosition(position);
                //TODO Do something with the selected text

                if (selection.equals("Yes")){
                    LinearLayout linearLayout = findViewById(R.id.c8p2);
                    linearLayout.setVisibility(View.VISIBLE);
                }else if (selection.equals("No")){
                    LinearLayout linearLayout = findViewById(R.id.c8p2);
                    linearLayout.setVisibility(View.GONE);
                }
            }
        });


        //-------c9------------//
        MaterialAutoCompleteTextView c9 = (MaterialAutoCompleteTextView) findViewById(R.id.c9);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c9Adapter = ArrayAdapter
                .createFromResource(this, R.array.c9array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c9Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c9.setAdapter(c9Adapter);

        //-------c10------------//
        MaterialAutoCompleteTextView c10p1 = (MaterialAutoCompleteTextView) findViewById(R.id.c10p1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c10p1Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c10p1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c10p1.setAdapter(c10p1Adapter);

        c10p1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                String selection = (String)parent.getItemAtPosition(position);
                //TODO Do something with the selected text

                if (selection.equals("Yes")){
//                    Toast.makeText(parent.getContext(), "You selected: " + selection,
//                            Toast.LENGTH_LONG).show();
                    LinearLayout linearLayout = findViewById(R.id.c10p21);
                    linearLayout.setVisibility(View.VISIBLE);
                }else if (selection.equals("No")){
                    LinearLayout linearLayout = findViewById(R.id.c10p21);
                    linearLayout.setVisibility(View.GONE);
                }
            }
        });


        //-------c11p1------------//
        MaterialAutoCompleteTextView c11p1 = (MaterialAutoCompleteTextView) findViewById(R.id.c11p1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c11p1Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c11p1Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c11p1.setAdapter(c11p1Adapter);

        c11p1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                String selection = (String)parent.getItemAtPosition(position);
                //TODO Do something with the selected text

                if (selection.equals("Yes")){
//                    Toast.makeText(parent.getContext(), "You selected: " + selection,
//                            Toast.LENGTH_LONG).show();
                    LinearLayout linearLayout = findViewById(R.id.c11p21);
                    linearLayout.setVisibility(View.VISIBLE);
                }else if (selection.equals("No")){
                    LinearLayout linearLayout = findViewById(R.id.c11p21);
                    linearLayout.setVisibility(View.GONE);
                }
            }
        });

        //-------c11p2------------//
        MaterialAutoCompleteTextView c11p2 = (MaterialAutoCompleteTextView) findViewById(R.id.c11p2);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c11p2Adapter = ArrayAdapter
                .createFromResource(this, R.array.c11p2array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c11p2Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c11p2.setAdapter(c11p2Adapter);


        //-------c12------------//
        MaterialAutoCompleteTextView c12 = (MaterialAutoCompleteTextView) findViewById(R.id.c12);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c12Adapter = ArrayAdapter
                .createFromResource(this, R.array.c12array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c12Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c12.setAdapter(c12Adapter);


        //-------c13------------//
        MaterialAutoCompleteTextView c13 = (MaterialAutoCompleteTextView) findViewById(R.id.c13);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c13Adapter = ArrayAdapter
                .createFromResource(this, R.array.binary_ans,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c13Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c13.setAdapter(c13Adapter);

        c13.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                String selection = (String)parent.getItemAtPosition(position);
                //TODO Do something with the selected text

                if (selection.equals("Yes")){
//                    Toast.makeText(parent.getContext(), "You selected: " + selection,
//                            Toast.LENGTH_LONG).show();
                    LinearLayout linearLayout = findViewById(R.id.c13p2);
                    linearLayout.setVisibility(View.VISIBLE);
                }else if (selection.equals("No")){
                    LinearLayout linearLayout = findViewById(R.id.c13p2);
                    linearLayout.setVisibility(View.GONE);
                }
            }
        });

        //           c13p2                    //

        MaterialAutoCompleteTextView c13p21 = (MaterialAutoCompleteTextView) findViewById(R.id.c13p21);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> c13p21Adapter = ArrayAdapter
                .createFromResource(this, R.array.c13p2array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        c13p21Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        c13p21.setAdapter(c13p21Adapter);



        Button submit = findViewById(R.id.saveclinical);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(getApplicationContext(),dashboard.class));
                finish();
            }
        });







    }



    private boolean CheckAllFields() {
        if (c1.length() == 0) {
            c1.setError("This field is required");
            return false;
        }

        if (c2.length() == 0) {
            c2.setError("This field is required");
            return false;
        }

        if (c3.length() == 0) {
            c3.setError("This field is required");
            return false;
        }


        // after all validation return true.
        return true;
    }
}