package com.example.osteoarthritisstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class koosScoring extends AppCompatActivity {

    //groups
    private RadioGroup radioGroupp1;
    private RadioGroup radioGroupp2;
    private RadioGroup radioGroupp3;
    private RadioGroup radioGroupp4;
    private RadioGroup radioGroupp5;
    private RadioGroup radioGroupp6;
    private RadioGroup radioGroupp7;
    private RadioGroup radioGroupp8;
    private RadioGroup radioGroupp9;

    private RadioGroup radioGroupsy1;
    private RadioGroup radioGroupsy2;
    private RadioGroup radioGroupsy3;
    private RadioGroup radioGroupsy4;
    private RadioGroup radioGroupsy5;
    private RadioGroup radioGroupsy6;
    private RadioGroup radioGroupsy7;

    private RadioGroup radioGroupa1;
    private RadioGroup radioGroupa2;
    private RadioGroup radioGroupa3;
    private RadioGroup radioGroupa4;
    private RadioGroup radioGroupa5;
    private RadioGroup radioGroupa6;
    private RadioGroup radioGroupa7;
    private RadioGroup radioGroupa8;
    private RadioGroup radioGroupa9;
    private RadioGroup radioGroupa10;
    private RadioGroup radioGroupa11;
    private RadioGroup radioGroupa12;
    private RadioGroup radioGroupa13;
    private RadioGroup radioGroupa14;
    private RadioGroup radioGroupa15;
    private RadioGroup radioGroupa16;
    private RadioGroup radioGroupa17;

    private RadioGroup radioGroupsp1;
    private RadioGroup radioGroupsp2;
    private RadioGroup radioGroupsp3;
    private RadioGroup radioGroupsp4;
    private RadioGroup radioGroupsp5;

    private RadioGroup radioGroupq1;
    private RadioGroup radioGroupq2;
    private RadioGroup radioGroupq3;
    private RadioGroup radioGroupq4;


    //radio buttons
    private RadioButton radioButtonp1;
    private RadioButton radioButtonp2;
    private RadioButton radioButtonp3;
    private RadioButton radioButtonp4;
    private RadioButton radioButtonp5;
    private RadioButton radioButtonp6;
    private RadioButton radioButtonp7;
    private RadioButton radioButtonp8;
    private RadioButton radioButtonp9;

    private RadioButton radioButtonsy1;
    private RadioButton radioButtonsy2;
    private RadioButton radioButtonsy3;
    private RadioButton radioButtonsy4;
    private RadioButton radioButtonsy5;
    private RadioButton radioButtonsy6;
    private RadioButton radioButtonsy7;

    private RadioButton radioButtona1;
    private RadioButton radioButtona2;
    private RadioButton radioButtona3;
    private RadioButton radioButtona4;
    private RadioButton radioButtona5;
    private RadioButton radioButtona6;
    private RadioButton radioButtona7;
    private RadioButton radioButtona8;
    private RadioButton radioButtona9;
    private RadioButton radioButtona10;
    private RadioButton radioButtona11;
    private RadioButton radioButtona12;
    private RadioButton radioButtona13;
    private RadioButton radioButtona14;
    private RadioButton radioButtona15;
    private RadioButton radioButtona16;
    private RadioButton radioButtona17;

    private RadioButton radioButtonsp1;
    private RadioButton radioButtonsp2;
    private RadioButton radioButtonsp3;
    private RadioButton radioButtonsp4;
    private RadioButton radioButtonsp5;

    private RadioButton radioButtonq1;
    private RadioButton radioButtonq2;
    private RadioButton radioButtonq3;
    private RadioButton radioButtonq4;


    private Button submit, upload;
    private int koos = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koos_scoring);

        ImageView back = findViewById(R.id.backkoos);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dashboard.class));
                finish();
            }
        });

        submit = findViewById(R.id.savekoos);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addListenerOnButton();
//                startActivity(new Intent(getApplicationContext(),dashboard.class));
//                finish();
            }
        });

        upload = findViewById(R.id.uploadkoos);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
            }
        });
    }


    public void addListenerOnButton() {
        //p
        radioGroupp1 = (RadioGroup) findViewById(R.id.radiop1);
        radioGroupp2 = (RadioGroup) findViewById(R.id.radiop2);
        radioGroupp3 = (RadioGroup) findViewById(R.id.radiop3);
        radioGroupp4 = (RadioGroup) findViewById(R.id.radiop4);
        radioGroupp5 = (RadioGroup) findViewById(R.id.radiop5);
        radioGroupp6 = (RadioGroup) findViewById(R.id.radiop6);
        radioGroupp7 = (RadioGroup) findViewById(R.id.radiop7);
        radioGroupp8 = (RadioGroup) findViewById(R.id.radiop8);
        radioGroupp9 = (RadioGroup) findViewById(R.id.radiop9);

        radioButtonp1 = findViewById(radioGroupp1.getCheckedRadioButtonId());
        radioButtonp2 = findViewById(radioGroupp2.getCheckedRadioButtonId());
        radioButtonp3 = findViewById(radioGroupp3.getCheckedRadioButtonId());
        radioButtonp4 = findViewById(radioGroupp4.getCheckedRadioButtonId());
        radioButtonp5 = findViewById(radioGroupp5.getCheckedRadioButtonId());
        radioButtonp6 = findViewById(radioGroupp6.getCheckedRadioButtonId());
        radioButtonp7 = findViewById(radioGroupp7.getCheckedRadioButtonId());
        radioButtonp8 = findViewById(radioGroupp8.getCheckedRadioButtonId());
        radioButtonp9 = findViewById(radioGroupp9.getCheckedRadioButtonId());

        float painkoos = Integer.parseInt(radioButtonp1.getTag().toString()) +Integer.parseInt(radioButtonp2.getTag().toString())
                +Integer.parseInt(radioButtonp3.getTag().toString()) + Integer.parseInt(radioButtonp4.getTag().toString())
                + Integer.parseInt(radioButtonp5.getTag().toString()) + Integer.parseInt(radioButtonp6.getTag().toString())
                + Integer.parseInt(radioButtonp7.getTag().toString()) + Integer.parseInt(radioButtonp8.getTag().toString())
                + Integer.parseInt(radioButtonp9.getTag().toString());

        painkoos = 100 - ((painkoos/9)*100) / 4;

        int painkoosRounded = Math.round(painkoos);
        //sy
        radioGroupsy1 = (RadioGroup) findViewById(R.id.radiosy1);
        radioGroupsy2 = (RadioGroup) findViewById(R.id.radiosy2);
        radioGroupsy3 = (RadioGroup) findViewById(R.id.radiosy3);
        radioGroupsy4 = (RadioGroup) findViewById(R.id.radiosy4);
        radioGroupsy5 = (RadioGroup) findViewById(R.id.radiosy5);
        radioGroupsy6 = (RadioGroup) findViewById(R.id.radiosy6);
        radioGroupsy7 = (RadioGroup) findViewById(R.id.radiosy7);

        radioButtonsy1 = findViewById(radioGroupsy1.getCheckedRadioButtonId());
        radioButtonsy2 = findViewById(radioGroupsy2.getCheckedRadioButtonId());
        radioButtonsy3 = findViewById(radioGroupsy3.getCheckedRadioButtonId());
        radioButtonsy4 = findViewById(radioGroupsy4.getCheckedRadioButtonId());
        radioButtonsy5 = findViewById(radioGroupsy5.getCheckedRadioButtonId());
        radioButtonsy6 = findViewById(radioGroupsy6.getCheckedRadioButtonId());
        radioButtonsy7 = findViewById(radioGroupsy7.getCheckedRadioButtonId());

        float symptomkoos = Integer.parseInt(radioButtonsy1.getTag().toString()) +Integer.parseInt(radioButtonsy2.getTag().toString())
                + Integer.parseInt(radioButtonsy3.getTag().toString()) + Integer.parseInt(radioButtonsy4.getTag().toString())
                + Integer.parseInt(radioButtonsy5.getTag().toString()) + Integer.parseInt(radioButtonsy6.getTag().toString())
                + Integer.parseInt(radioButtonsy7.getTag().toString());

        symptomkoos = 100 - ((symptomkoos/7)*100) / 4;

        int symptomkoosRounded = Math.round(symptomkoos);

        //a

        radioGroupa1 = findViewById(R.id.radioa1);
        radioGroupa2 = findViewById(R.id.radioa2);
        radioGroupa3 = findViewById(R.id.radioa3);
        radioGroupa4 = findViewById(R.id.radioa4);
        radioGroupa5 = findViewById(R.id.radioa5);
        radioGroupa6 = findViewById(R.id.radioa6);
        radioGroupa7 = findViewById(R.id.radioa7);
        radioGroupa8 = findViewById(R.id.radioa8);
        radioGroupa9 = findViewById(R.id.radioa9);
        radioGroupa10 = findViewById(R.id.radioa10);
        radioGroupa11 = findViewById(R.id.radioa11);
        radioGroupa12 = findViewById(R.id.radioa12);
        radioGroupa13 = findViewById(R.id.radioa13);
        radioGroupa14 = findViewById(R.id.radioa14);
        radioGroupa15 = findViewById(R.id.radioa15);
        radioGroupa16 = findViewById(R.id.radioa16);
        radioGroupa17 = findViewById(R.id.radioa17);


        radioButtona1 = findViewById(radioGroupa1.getCheckedRadioButtonId());
        radioButtona2 = findViewById(radioGroupa2.getCheckedRadioButtonId());
        radioButtona3 = findViewById(radioGroupa3.getCheckedRadioButtonId());
        radioButtona4 = findViewById(radioGroupa4.getCheckedRadioButtonId());
        radioButtona5 = findViewById(radioGroupa5.getCheckedRadioButtonId());
        radioButtona6 = findViewById(radioGroupa6.getCheckedRadioButtonId());
        radioButtona7 = findViewById(radioGroupa7.getCheckedRadioButtonId());
        radioButtona8 = findViewById(radioGroupa8.getCheckedRadioButtonId());
        radioButtona9 = findViewById(radioGroupa9.getCheckedRadioButtonId());
        radioButtona10 = findViewById(radioGroupa10.getCheckedRadioButtonId());
        radioButtona11 = findViewById(radioGroupa11.getCheckedRadioButtonId());
        radioButtona12 = findViewById(radioGroupa12.getCheckedRadioButtonId());
        radioButtona13 = findViewById(radioGroupa13.getCheckedRadioButtonId());
        radioButtona14 = findViewById(radioGroupa14.getCheckedRadioButtonId());
        radioButtona15 = findViewById(radioGroupa15.getCheckedRadioButtonId());
        radioButtona16 = findViewById(radioGroupa16.getCheckedRadioButtonId());
        radioButtona17 = findViewById(radioGroupa17.getCheckedRadioButtonId());

        float adlkoos = Integer.parseInt(radioButtona1.getTag().toString()) +
                Integer.parseInt(radioButtona2.getTag().toString()) + Integer.parseInt(radioButtona3.getTag().toString())
                + Integer.parseInt(radioButtona4.getTag().toString()) + Integer.parseInt(radioButtona5.getTag().toString())
                + Integer.parseInt(radioButtona6.getTag().toString()) + Integer.parseInt(radioButtona7.getTag().toString())
                + Integer.parseInt(radioButtona8.getTag().toString()) + Integer.parseInt(radioButtona9.getTag().toString())
                + Integer.parseInt(radioButtona10.getTag().toString()) + Integer.parseInt(radioButtona11.getTag().toString())
                + Integer.parseInt(radioButtona12.getTag().toString()) + Integer.parseInt(radioButtona13.getTag().toString())
                + Integer.parseInt(radioButtona14.getTag().toString()) + Integer.parseInt(radioButtona15.getTag().toString())
                + Integer.parseInt(radioButtona16.getTag().toString()) + Integer.parseInt(radioButtona17.getTag().toString());

        adlkoos = 100 - ((adlkoos/17)*100) / 4;

        int adlkoosRounded = Math.round(adlkoos);

        //sp

        radioGroupsp1 = findViewById(R.id.radioa1);
        radioGroupsp2 = findViewById(R.id.radioa2);
        radioGroupsp3 = findViewById(R.id.radioa3);
        radioGroupsp4 = findViewById(R.id.radioa4);
        radioGroupsp5 = findViewById(R.id.radioa5);

        radioButtonsp1 = findViewById(radioGroupsp1.getCheckedRadioButtonId());
        radioButtonsp2 = findViewById(radioGroupsp2.getCheckedRadioButtonId());
        radioButtonsp3 = findViewById(radioGroupsp3.getCheckedRadioButtonId());
        radioButtonsp4 = findViewById(radioGroupsp4.getCheckedRadioButtonId());
        radioButtonsp5 = findViewById(radioGroupsp5.getCheckedRadioButtonId());

        float sportkoos = Integer.parseInt(radioButtonsp1.getTag().toString()) +Integer.parseInt(radioButtonsp2.getTag().toString())
                + Integer.parseInt(radioButtonsp3.getTag().toString()) + Integer.parseInt(radioButtonsp4.getTag().toString())
                + Integer.parseInt(radioButtonsp5.getTag().toString()) ;

        sportkoos = 100 - ((sportkoos/5)*100) / 4;

        int sportRounded = Math.round(sportkoos);

        //q
        radioGroupq1 = findViewById(R.id.radioq1);
        radioGroupq2 = findViewById(R.id.radioq2);
        radioGroupq3 = findViewById(R.id.radioq3);
        radioGroupq4 = findViewById(R.id.radioq4);

        radioButtonq1 = findViewById(radioGroupq1.getCheckedRadioButtonId());
        radioButtonq2 = findViewById(radioGroupq2.getCheckedRadioButtonId());
        radioButtonq3 = findViewById(radioGroupq3.getCheckedRadioButtonId());
        radioButtonq4 = findViewById(radioGroupq4.getCheckedRadioButtonId());

        float qualitykoos = Integer.parseInt(radioButtonq1.getTag().toString()) +Integer.parseInt(radioButtonq2.getTag().toString())
                + Integer.parseInt(radioButtonq3.getTag().toString()) + Integer.parseInt(radioButtonq4.getTag().toString()) ;

        qualitykoos = 100 - ((qualitykoos/4)*100) / 4;

        int qualityRounded = Math.round(qualitykoos);


        koos = (int) Math.round((painkoosRounded+symptomkoosRounded+adlkoosRounded+sportRounded+qualityRounded)/5.0);



        // get selected radio button from radioGroup
//        int selectedId = radioGroupp1.getCheckedRadioButtonId();
//
//        // find the radiobutton by returned id
//        radioButtonp1 = findViewById(radioGroupp1.getCheckedRadioButtonId());

        Toast.makeText(getApplicationContext(), "KOOS Score is :"+Integer.toString(koos), Toast.LENGTH_SHORT).show();



    }
}