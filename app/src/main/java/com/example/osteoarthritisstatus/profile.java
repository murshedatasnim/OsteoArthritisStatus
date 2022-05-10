package com.example.osteoarthritisstatus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hbb20.CountryCodePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class profile extends AppCompatActivity {

//    final Calendar myCalendar= Calendar.getInstance();
    private CountryCodePicker ccp;
    private TextView current_phone;
//    EditText editText;
    private AlertDialog.Builder dialogbuilder;
    private AlertDialog dialog;
    private EditText newphone;
    private Button savephone, cancelupdate;
    private EditText otp;
    private Button otpUpdate;
    private Button otpCancel;
//    String phonenumber;
    private String otpid;
    private EditText pid;
    private FirebaseAuth mAuth;

    FirebaseDatabase rootNode;
    DatabaseReference reference;


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
        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference( "profiles");
        pid = findViewById(R.id.pid);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String uid = FirebaseAuth.getInstance().getCurrentUser().getUid();

                String pid1 = pid.getText().toString();
                String phone = FirebaseAuth.getInstance().getCurrentUser().getPhoneNumber();

//                Toast.makeText(getApplicationContext(), pid1, Toast.LENGTH_SHORT).show();

                profileHelper helper = new profileHelper(uid,pid1,phone);

                reference.child(uid).setValue(helper);

                Toast.makeText(getApplicationContext(),"PID is saved", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getApplicationContext(),dashboard.class));
                finish();
            }
        });


        current_phone = findViewById(R.id.phone);
        String userphone = FirebaseAuth.getInstance().getCurrentUser().getPhoneNumber();
        current_phone.setText(userphone);

        Button update = findViewById(R.id.updatephone);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updatePhone();
            }
        });

         reference.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("pid").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.e("firebase", "Error getting data", task.getException());
                }
                else {
                    Log.d("firebase", String.valueOf(task.getResult().getValue()));
                    pid.setText(String.valueOf(task.getResult().getValue()));
                }
            }
        });



        //----gender--------
//        MaterialAutoCompleteTextView gender = (MaterialAutoCompleteTextView) findViewById(R.id.gender);
//
//        // Create an ArrayAdapter using the string array and a default spinner
//        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter
//                .createFromResource(this, R.array.genderarray,
//                        android.R.layout.simple_spinner_dropdown_item);
//
//        // Specify the layout to use when the list of choices appears
//        genderAdapter
//                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        // Apply the adapter to the spinner
//        gender.setAdapter(genderAdapter);
//
//        //-----race-----
//        MaterialAutoCompleteTextView race = (MaterialAutoCompleteTextView) findViewById(R.id.race);

        // Create an ArrayAdapter using the string array and a default spinner
//        ArrayAdapter<CharSequence> raceAdapter = ArrayAdapter
//                .createFromResource(this, R.array.racearray,
//                        android.R.layout.simple_spinner_dropdown_item);
//
//        // Specify the layout to use when the list of choices appears
//        raceAdapter
//                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        // Apply the adapter to the spinner
//        race.setAdapter(raceAdapter);


//        this.showDatePickerDialog();

    }
//    private void showDatePickerDialog()
//    {
//        // Get open DatePickerDialog button.
//        EditText datePickerDialogButton = (EditText) findViewById(R.id.dob);
//        datePickerDialogButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Create a new OnDateSetListener instance. This listener will be invoked when user click ok button in DatePickerDialog.
//                DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
//                        StringBuffer strBuf = new StringBuffer();
////                        strBuf.append("You select date is ");
//                        strBuf.append(year);
//                        strBuf.append("-");
//                        strBuf.append(month+1);
//                        strBuf.append("-");
//                        strBuf.append(dayOfMonth);
//                        TextView datePickerValueTextView = (TextView)findViewById(R.id.dob);
//                        datePickerValueTextView.setText(strBuf.toString());
//                    }
//                };
//                // Get current year, month and day.
//                Calendar now = Calendar.getInstance();
//                int year = now.get(java.util.Calendar.YEAR);
//                int month = now.get(java.util.Calendar.MONTH);
//                int day = now.get(java.util.Calendar.DAY_OF_MONTH);
//                // Create the new DatePickerDialog instance.
//                // Create the new DatePickerDialog instance.
//                DatePickerDialog datePickerDialog = new DatePickerDialog(profile.this, android.R.style.Theme_Holo_Dialog, onDateSetListener, year, month, day);
//                datePickerDialog.show();
//            }
//        });
//    }


    public void updatePhone(){
        dialogbuilder = new AlertDialog.Builder(this);
        final View update_phone_view = getLayoutInflater().inflate(R.layout.popup, null);



        savephone = update_phone_view.findViewById(R.id.dophoneupdatebutton);
        cancelupdate = update_phone_view.findViewById(R.id.cancelphoneupdatebutton);
        dialogbuilder.setView(update_phone_view);
        dialog = dialogbuilder.create();
        dialog.show();

        savephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newphone = update_phone_view.findViewById(R.id.updatedphone);
                ccp=update_phone_view.findViewById(R.id.ccp);
                ccp.registerCarrierNumberEditText(newphone);
                String newPhoneno = ccp.getFullNumberWithPlus().replace(" ","");
//                Log.d("phone", newPhoneno);
//                FirebaseAuth.getInstance().getCurrentUser().updatePhoneNumber(newPhone);
                dialog.dismiss();
                confirmUpdate(newPhoneno);


            }
        });

        cancelupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

    public void confirmUpdate(String phone){

        dialogbuilder = new AlertDialog.Builder(this);
        final View update_phone_view = getLayoutInflater().inflate(R.layout.otp_popup, null);

        otp = update_phone_view.findViewById(R.id.otp);
        otpUpdate = update_phone_view.findViewById(R.id.otpConfirm);
        otpCancel = update_phone_view.findViewById(R.id.otpCancel);
        dialogbuilder.setView(update_phone_view);
        dialog = dialogbuilder.create();
        dialog.show();

        mAuth=FirebaseAuth.getInstance();

        initiateotp(phone);

        otpUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(otp.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(),"Blank Field can not be processed",Toast.LENGTH_LONG).show();
                else if(otp.getText().toString().length()!=6)
                    Toast.makeText(getApplicationContext(),"Invalid OTP",Toast.LENGTH_LONG).show();
                else
                {
                    PhoneAuthCredential phoneAuthCredential = PhoneAuthProvider.getCredential( phone, otpid );
                    FirebaseAuth.getInstance().getCurrentUser().updatePhoneNumber(phoneAuthCredential)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                       @Override
                                                       public void onComplete(@NonNull Task<Void> task) {
                                                           if (task.isSuccessful()) {
                                                               // Update Successfully
                                                               String userphone = FirebaseAuth.getInstance().getCurrentUser().getPhoneNumber();
                                                               current_phone.setText(userphone);
                                                               Toast.makeText(getApplicationContext(),"Update Successful",Toast.LENGTH_LONG).show();
                                                               dialog.dismiss();
                                                           } else {
                                                               // Failed
                                                               Toast.makeText(getApplicationContext(),"Update failed",Toast.LENGTH_LONG).show();
                                                               dialog.dismiss();
                                                           }
                                                       }
                                                   }
                            );
                }

            }
        });

        otpCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });



    }


    private void initiateotp(String phone)
    {

        PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber(phone)       // Phone number to verify
                        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
                        .setActivity(this)                 // Activity (for callback binding)
                        .setCallbacks(
                                new PhoneAuthProvider.OnVerificationStateChangedCallbacks()
                                {
                                    @Override
                                    public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken)
                                    {
                                        otpid=s;
                                    }

                                    @Override
                                    public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential)
                                    {
//                                        signInWithPhoneAuthCredential(phoneAuthCredential);
                                        FirebaseAuth.getInstance().getCurrentUser().updatePhoneNumber(phoneAuthCredential)
                                                .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                                           @Override
                                                                           public void onComplete(@NonNull Task<Void> task) {
                                                                               if (task.isSuccessful()) {
                                                                                   // Update Successfully
                                                                                   Toast.makeText(getApplicationContext(),"Update Successful",Toast.LENGTH_LONG).show();
                                                                                   dialog.dismiss();
                                                                               } else {
                                                                                   // Failed
                                                                                   Toast.makeText(getApplicationContext(),"Update failed",Toast.LENGTH_LONG).show();
                                                                                   dialog.dismiss();
                                                                               }
                                                                           }
                                                                       }
                                                );
                                    }

                                    @Override
                                    public void onVerificationFailed(FirebaseException e) {
                                        Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
                                    }
                                }
                        )          // OnVerificationStateChangedCallbacks
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);



    }



}


