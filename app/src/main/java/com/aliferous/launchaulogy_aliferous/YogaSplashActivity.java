package com.aliferous.launchaulogy_aliferous;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

public class YogaSplashActivity extends AppCompatActivity {

    ImageView Splash1,Splash2,Splashbg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_splash);

        Splash1 = findViewById(R.id.yoga_splash_1);
        Splash2 = findViewById(R.id.yoga_splash_2);
        Splashbg = findViewById(R.id.splash_bg);

        Splash1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(Splash1, "alpha", 1f, 0f);
                oa1.setDuration(1000);
                oa1.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.start();
                Splash1.setVisibility(View.GONE);
                Splash2.setVisibility(View.VISIBLE);
                ObjectAnimator oa2 = ObjectAnimator.ofFloat(Splash2, "alpha", 0f, 1f);
                oa2.setDuration(1000);
                oa2.setInterpolator(new AccelerateDecelerateInterpolator());
                oa2.start();
            }
        });

        Splash2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(Splash2, "alpha", 1f, 0f);
                oa1.setDuration(1000);
                oa1.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.start();
                Intent intent = new Intent(YogaSplashActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}