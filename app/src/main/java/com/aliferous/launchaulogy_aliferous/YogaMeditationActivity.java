package com.aliferous.launchaulogy_aliferous;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class YogaMeditationActivity extends AppCompatActivity {

    ImageView navHome, navYoga, navAilment, navProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_meditation);

        //Nav-Bar Start
        navHome=findViewById(R.id.nav_home);
        navYoga=findViewById(R.id.nav_yoga);
        navAilment=findViewById(R.id.nav_ailment);
        navProfile=findViewById(R.id.nav_profile);

        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YogaMeditationActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        navYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(YogaMeditationActivity.this, YogaMeditationActivity.class);
                //startActivity(intent);
            }
        });
        navAilment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YogaMeditationActivity.this, AilmentsActivity.class);
                startActivity(intent);
            }
        });
        navProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YogaMeditationActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        //Nav-Bar End
    }
}