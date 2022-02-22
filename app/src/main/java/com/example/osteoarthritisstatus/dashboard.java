package com.example.osteoarthritisstatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class dashboard extends AppCompatActivity
{
  Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button profileButton = findViewById(R.id.buttonprofile);
        Button socioinfoButton = findViewById(R.id.buttonsocio);
        Button clinicalinfoButton = findViewById(R.id.buttonClinical);
        Button koos = findViewById(R.id.buttonkoos);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),profile.class));
                finish();
            }
        });

        socioinfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),sociodemographyinfo.class));
                finish();
            }
        });

        clinicalinfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),clinicalinfo.class));
                finish();
            }
        });

        koos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),koosScoring.class));
                finish();
            }
        });

        btn=(Button)findViewById(R.id.Logout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });

        btn1=(Button)findViewById(R.id.exit);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                FirebaseAuth.getInstance().signOut();
                finish();
                System.exit(0);
            }
        });
    }
}