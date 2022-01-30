package com.aliferous.launchaulogy_aliferous;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PhysicalWellnessActivity extends AppCompatActivity {

    ImageView circle1,circle2,circle3,circle4,circle5;
    ImageView navHome, navYoga, navAilment, navProfile;
    TextView tvButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_wellness);

        circle1 = findViewById(R.id.circle1);
        circle2 = findViewById(R.id.circle2);
        circle3 = findViewById(R.id.circle3);
        circle4 = findViewById(R.id.circle4);
        circle5 = findViewById(R.id.circle5);
        tvButton= findViewById(R.id.textViewButton);


        circle1.getBackground().setAlpha(10);
        circle2.getBackground().setAlpha(10);
        circle3.getBackground().setAlpha(10);
        circle4.getBackground().setAlpha(10);
        circle5.getBackground().setAlpha(10);


        circle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(circle1, "alpha", 0f, 1f);
                oa1.setDuration(250);
                oa1.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        Intent intent = new Intent(PhysicalWellnessActivity.this,AilmentsActivity.class);
                        intent.putExtra("Value",1);
                        startActivity(intent);
                        circle1.getBackground().setAlpha(10);
                    }
                });
                oa1.start();
                circle1.getBackground().setAlpha(255);

            }
        });

        circle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(circle2, "alpha", 0f, 1f);
                oa1.setDuration(250);
                oa1.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        Intent intent = new Intent(PhysicalWellnessActivity.this,AilmentsActivity.class);
                        intent.putExtra("Value",2);
                        startActivity(intent);
                        circle2.getBackground().setAlpha(10);
                    }
                });
                oa1.start();
                circle2.getBackground().setAlpha(255);
            }
        });

        circle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(circle3, "alpha", 0f, 1f);
                oa1.setDuration(250);
                oa1.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        Intent intent = new Intent(PhysicalWellnessActivity.this,AilmentsActivity.class);
                        intent.putExtra("Value",2);
                        startActivity(intent);
                        circle3.getBackground().setAlpha(10);
                    }
                });
                oa1.start();
                circle3.getBackground().setAlpha(255);
            }
        });
        circle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(circle4, "alpha", 0f, 1f);
                oa1.setDuration(250);
                oa1.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        Intent intent = new Intent(PhysicalWellnessActivity.this,AilmentsActivity.class);
                        intent.putExtra("Value",3);
                        startActivity(intent);
                        circle4.getBackground().setAlpha(10);
                    }
                });
                oa1.start();
                circle4.getBackground().setAlpha(255);
            }
        });

        circle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(circle5, "alpha", 0f, 1f);
                oa1.setDuration(250);
                oa1.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        Intent intent = new Intent(PhysicalWellnessActivity.this,AilmentsActivity.class);
                        intent.putExtra("Value",3);
                        startActivity(intent);
                        circle5.getBackground().setAlpha(10);
                    }
                });
                oa1.start();
                circle5.getBackground().setAlpha(255);
            }
        });

        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysicalWellnessActivity.this,FullBodyFitnessActivity.class);
                startActivity(intent);
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
                Intent intent = new Intent(PhysicalWellnessActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        navYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysicalWellnessActivity.this, YogaMeditationActivity.class);
                startActivity(intent);
            }
        });
        navAilment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysicalWellnessActivity.this, AilmentsActivity.class);
                startActivity(intent);
            }
        });
        navProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhysicalWellnessActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        //Nav-Bar End

    }
}