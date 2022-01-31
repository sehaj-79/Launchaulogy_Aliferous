package com.aliferous.launchaulogy_aliferous;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView navHome, navYoga, navAilment, navProfile;
    ConstraintLayout HomeScreen,SplashScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        HomeScreen = findViewById(R.id.homePage);
        SplashScreen = findViewById(R.id.SplashScreen);

        SplashScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(HomeScreen, "alpha", 0f, 1f);
                oa1.setDuration(400);
                oa1.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.start();
                HomeScreen.setVisibility(View.VISIBLE);

            }
        });



        //Nav-Bar Start
        navHome=findViewById(R.id.nav_home);
        navYoga=findViewById(R.id.nav_yoga);
        navAilment=findViewById(R.id.nav_ailment);
        navProfile=findViewById(R.id.nav_profile);

        navHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                //startActivity(intent);
            }
        });
        navYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, YogaMeditationActivity.class);
                startActivity(intent);
            }
        });
        navAilment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PhysicalWellnessActivity.class);
                startActivity(intent);
            }
        });
        navProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        //Nav-Bar End
    }
}