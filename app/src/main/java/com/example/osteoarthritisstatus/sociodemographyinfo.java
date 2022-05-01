package com.example.osteoarthritisstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sociodemographyinfo extends AppCompatActivity {

    private String UID;
    private String occupation;
    private String workAssociation;
    private String houseType;
    private String floor;
    private String frequentUseOfStaircase;
    private String houseToiletType;
    private String prayerPosition;

    private EditText s4;
    private MaterialAutoCompleteTextView s1, s2, s3, s5, s6, s7;

    private FirebaseDatabase rootNode;
    private DatabaseReference reference;

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


        //-------s1------------//
        s1 = findViewById(R.id.s1);

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
        s2 = findViewById(R.id.s2);

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
        s3 = findViewById(R.id.s3);

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

        s4 = findViewById(R.id.s4);

        //--------s5----------//
        s5 = findViewById(R.id.s5);

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
        s6 = findViewById(R.id.s6);

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
        s7 = findViewById(R.id.s7);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> s7Adapter = ArrayAdapter
                .createFromResource(this, R.array.s7array,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        s7Adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        s7.setAdapter(s7Adapter);

        s1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                occupation = (String)parent.getItemAtPosition(position);
//                Toast.makeText(getApplicationContext(), occupation, Toast.LENGTH_SHORT).show();

            }
        });

        s2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                workAssociation = (String)parent.getItemAtPosition(position);

            }
        });

        s3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                houseToiletType = (String)parent.getItemAtPosition(position);

            }
        });



        s5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                frequentUseOfStaircase = (String)parent.getItemAtPosition(position);

            }
        });

        s6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                houseToiletType = (String)parent.getItemAtPosition(position);

            }
        });

        s7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                prayerPosition = (String)parent.getItemAtPosition(position);

            }
        });



        Button submit = findViewById(R.id.savesocioinfo);

        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference( "socioDemographicInfos");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                floor = s4.getText().toString();

                UID = FirebaseAuth.getInstance().getCurrentUser().getUid();

                sociodemographicInfoHelper helper = new sociodemographicInfoHelper(UID,
                        occupation, workAssociation, houseType, floor, frequentUseOfStaircase,
                        houseToiletType, prayerPosition);

                reference.child(UID).setValue(helper);
//                Log.d("occupation", "occ");
//
                Toast.makeText(getApplicationContext(),"submitted", Toast.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(), floor, Toast.LENGTH_SHORT).show();


                startActivity(new Intent(getApplicationContext(),dashboard.class));
                finish();
            }
        });


    }
}