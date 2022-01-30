package com.aliferous.launchaulogy_aliferous;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class AilmentsActivity extends AppCompatActivity {

    FrameLayout button1,button2,button3;
    ImageView navHome, navYoga, navAilment, navProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ailments);


        button1 = findViewById(R.id.Ailment_treatment);
        button2 = findViewById(R.id.Ailment_yoga);
        button3 = findViewById(R.id.Ailment_remedies);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AilmentsActivity.this, CausesTreatmentActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AilmentsActivity.this, YogaMeditationActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AilmentsActivity.this, HomeRemediesActivity.class);
                startActivity(intent);
            }
        });



      /*  //Nav-Bar Start
        navHome=findViewById(R.id.nav_home);
        navYoga=findViewById(R.id.nav_yoga);
        navAilment=findViewById(R.id.nav_ailment);
        navProfile=findViewById(R.id.nav_profile);

        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AilmentsActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        navYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AilmentsActivity.this, YogaMeditationActivity.class);
                startActivity(intent);
            }
        });
        navAilment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AilmentsActivity.this, PhysicalWellnessActivity.class);
                startActivity(intent);
            }
        });
        navProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AilmentsActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        //Nav-Bar End*/
    }
}