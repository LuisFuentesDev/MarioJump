package com.example.ejercicio7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button animateButton;
    private ImageView mario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mario = findViewById(R.id.imageMario);
        animateButton = findViewById(R.id.buttonJump);
    }


    public void onAnimateButtonClick(View view) {
        Animation slideUp = new TranslateAnimation(0, 0, 0, -200);
        slideUp.setDuration(500);
        slideUp.setFillAfter(true);

        Animation slideDown = new TranslateAnimation(0, 0, 0, 0);
        slideDown.setDuration(500);
        slideDown.setFillAfter(true);

        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(slideUp);
        animationSet.addAnimation(slideDown);

        mario.startAnimation(animationSet);
    }
}