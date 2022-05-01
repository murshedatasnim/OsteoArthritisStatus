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
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class clinicalinfo extends AppCompatActivity {
    private TextInputEditText c1, c2, c3, other_c6, other_c8, c10p2;
    private MaterialAutoCompleteTextView c4, c5, c7;

    private String height, weight, waist_circumference;
    private String isKneePain, affectedKnee;
    private ArrayList<String> symptoms = new ArrayList<>();
    private String isPainInOtherJoints;
    private ArrayList<String> otherJointsHavingPain = new ArrayList<>();
    private String isChronicIllness;
    private ArrayList<String> chronicIllnesses = new ArrayList<>();
    private String menstrualHistory;
    private String isSmoker, sticksPerDay;
    private String isAlcoholic, alcoholIntakeFrequency;
    private String sportsActivity, isAnyRecentInjury, recentInjury;

    private FirebaseDatabase rootNode;
    private DatabaseReference reference;
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

        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference( "clinicalInfos");

        //---------------c1===height--------------//
        c1 = findViewById(R.id.c1);

        //---------------c2===weight-------------//
        c2 = findViewById(R.id.c2);

        //---------------c3==waist circumference--------------//
        c3 = findViewById(R.id.c3);


        //-------c4==knee pain?------------//
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

        //-------c5===affected knee------------//
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


        //--------c6-==symptoms--------//
        CheckBox pain,swelling,deformity,stiffness,movement;
        pain = findViewById(R.id.c6pain);
        swelling = findViewById(R.id.c6swelling);
        deformity = findViewById(R.id.c6Deformity);
        stiffness = findViewById(R.id.c6stiffness);
        movement = findViewById(R.id.c6movementrestriction);
        other_c6 = findViewById(R.id.c6other);


        //-------c7==pain in other joints------------//
        c7 = (MaterialAutoCompleteTextView) findViewById(R.id.c7);

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


        //-------c8==chronic illness???------------//
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


        //chronic illness

        CheckBox dyslipidaemia, cardiac, hypertension, diabetes_mellitus, cancer, asthma, chronic_kidney,
                rheumatoid_arthritis, gout, other_Chronic_musculoskeletal_disorder;
        dyslipidaemia = findViewById(R.id.c8Dyslipidaemia);
        cardiac = findViewById(R.id.c8Cardiacdisease);
        hypertension = findViewById(R.id.c8Hypertension);
        diabetes_mellitus = findViewById(R.id.c8DiabetesMellitus);
        cancer = findViewById(R.id.c8cancer);
        asthma = findViewById(R.id.c8asthma);
        chronic_kidney = findViewById(R.id.c8chronickidney);
        rheumatoid_arthritis = findViewById(R.id.c8RheumatoidArthritis);
        gout = findViewById(R.id.c8gout);
        other_Chronic_musculoskeletal_disorder = findViewById(R.id.c8chronicmusculoskeletal);
        other_c8 = findViewById(R.id.c8other);



        //-------c9===menstrual history------------//
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

        //-------c10===smoking------------//
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

        //------------c10p2==sticks per day-------//

        c10p2 = findViewById(R.id.c10p2);


        //-------c11p1===alcohol??????------------//
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

        //-------c11p2==frequency------------//
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


        //-------c12=sports activity------------//
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


        //-------c13=recent injury??------------//
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

        //-----------c13p2 =recent injury---------- //

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



        c4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                isKneePain = (String)parent.getItemAtPosition(position);
//                        Toast.makeText(getApplicationContext(), isKneePain, Toast.LENGTH_SHORT).show();

            }
        });

        c11p2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                alcoholIntakeFrequency = (String)parent.getItemAtPosition(position);

            }
        });

        c12.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                sportsActivity = (String)parent.getItemAtPosition(position);

            }
        });
        c13p21.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                recentInjury = (String)parent.getItemAtPosition(position);

            }
        });

        Button submit = findViewById(R.id.saveclinical);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                height = c1.getText().toString();
                weight = c2.getText().toString();
                waist_circumference = c3.getText().toString();

                affectedKnee = c5.getText().toString();

                if (pain.isChecked()) symptoms.add(pain.getText().toString());
                if (swelling.isChecked()) symptoms.add(swelling.getText().toString());
                if (deformity.isChecked()) symptoms.add(deformity.getText().toString());
                if (stiffness.isChecked()) symptoms.add(stiffness.getText().toString());
                if (movement.isChecked()) symptoms.add(movement.getText().toString());
                if (!other_c6.getText().toString().equals("")) symptoms.add(other_c6.getText().toString());

                isPainInOtherJoints = c7.getText().toString();

                if (hip.isChecked()) otherJointsHavingPain.add(hip.getText().toString());
                if (ankle.isChecked()) otherJointsHavingPain.add(ankle.getText().toString());
                if (smallJointOfFinger.isChecked()) otherJointsHavingPain.add(smallJointOfFinger.getText().toString());
                if (baseOfThumbJoint.isChecked()) otherJointsHavingPain.add(baseOfThumbJoint.getText().toString());
                if (neckPain.isChecked()) otherJointsHavingPain.add(neckPain.getText().toString());
                if (backPain.isChecked()) otherJointsHavingPain.add(backPain.getText().toString());

                isChronicIllness = c8.getText().toString();

                if (dyslipidaemia.isChecked()) chronicIllnesses.add(dyslipidaemia.getText().toString());
                if (cardiac.isChecked()) chronicIllnesses.add(cardiac.getText().toString());
                if (hypertension.isChecked()) chronicIllnesses.add(hypertension.getText().toString());
                if (diabetes_mellitus.isChecked()) chronicIllnesses.add(diabetes_mellitus.getText().toString());
                if (cancer.isChecked()) chronicIllnesses.add(cancer.getText().toString());
                if (asthma.isChecked()) chronicIllnesses.add(asthma.getText().toString());
                if (chronic_kidney.isChecked()) chronicIllnesses.add(chronic_kidney.getText().toString());
                if (rheumatoid_arthritis.isChecked()) chronicIllnesses.add(rheumatoid_arthritis.getText().toString());
                if (gout.isChecked()) chronicIllnesses.add(gout.getText().toString());
                if (other_Chronic_musculoskeletal_disorder.isChecked()) chronicIllnesses.add(other_Chronic_musculoskeletal_disorder.getText().toString());
                if (!other_c8.getText().toString().equals("")) chronicIllnesses.add(other_c8.getText().toString());

                menstrualHistory = c9.getText().toString();
                isSmoker = c10p1.getText().toString();
                sticksPerDay = c10p2.getText().toString();

                isAlcoholic = c11p1.getText().toString();


                isAnyRecentInjury = c13.getText().toString();


                String uid = FirebaseAuth.getInstance().getCurrentUser().getUid();

                ClinicalInfoHelper clinicalInfoHelper = new ClinicalInfoHelper(uid,
                        height, weight, waist_circumference, isKneePain, affectedKnee, symptoms, isPainInOtherJoints, otherJointsHavingPain,
                        isChronicIllness, chronicIllnesses, menstrualHistory, isSmoker, sticksPerDay, isAlcoholic, alcoholIntakeFrequency, sportsActivity,
                        isAnyRecentInjury, recentInjury);

                reference.child(uid).setValue(clinicalInfoHelper);

                Toast.makeText(getApplicationContext(),"submitted", Toast.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(), clinicalInfoHelper.getAffectedKnee(), Toast.LENGTH_SHORT).show();

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

        if (c4.length() == 0) {
            c4.setError("This field is required");
            return false;
        }

        if (c5.length() == 0) {
            c5.setError("This field is required");
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