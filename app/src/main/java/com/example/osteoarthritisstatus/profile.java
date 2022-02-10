package com.example.osteoarthritisstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class profile extends AppCompatActivity {

//    final Calendar myCalendar= Calendar.getInstance();
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dashboard.class));
                finish();
            }
        });

        Button button = findViewById(R.id.saveprofile);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),dashboard.class));
                finish();
            }
        });

        //----gender--------
        MaterialAutoCompleteTextView gender = (MaterialAutoCompleteTextView) findViewById(R.id.gender);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter
                .createFromResource(this, R.array.genderarray,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        genderAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        gender.setAdapter(genderAdapter);

        //-----race-----
        MaterialAutoCompleteTextView race = (MaterialAutoCompleteTextView) findViewById(R.id.race);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> raceAdapter = ArrayAdapter
                .createFromResource(this, R.array.racearray,
                        android.R.layout.simple_spinner_dropdown_item);

        // Specify the layout to use when the list of choices appears
        raceAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        race.setAdapter(raceAdapter);


        this.showDatePickerDialog();

    }
    private void showDatePickerDialog()
    {
        // Get open DatePickerDialog button.
        EditText datePickerDialogButton = (EditText) findViewById(R.id.dob);
        datePickerDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new OnDateSetListener instance. This listener will be invoked when user click ok button in DatePickerDialog.
                DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        StringBuffer strBuf = new StringBuffer();
//                        strBuf.append("You select date is ");
                        strBuf.append(year);
                        strBuf.append("-");
                        strBuf.append(month+1);
                        strBuf.append("-");
                        strBuf.append(dayOfMonth);
                        TextView datePickerValueTextView = (TextView)findViewById(R.id.dob);
                        datePickerValueTextView.setText(strBuf.toString());
                    }
                };
                // Get current year, month and day.
                Calendar now = Calendar.getInstance();
                int year = now.get(java.util.Calendar.YEAR);
                int month = now.get(java.util.Calendar.MONTH);
                int day = now.get(java.util.Calendar.DAY_OF_MONTH);
                // Create the new DatePickerDialog instance.
                // Create the new DatePickerDialog instance.
                DatePickerDialog datePickerDialog = new DatePickerDialog(profile.this, android.R.style.Theme_Holo_Dialog, onDateSetListener, year, month, day);
                datePickerDialog.show();
            }
        });
    }
}