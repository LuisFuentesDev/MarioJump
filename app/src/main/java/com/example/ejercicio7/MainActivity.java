package com.example.ejercicio7;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView mario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mario = findViewById(R.id.imageMario);
        findViewById(R.id.buttonJump);
        Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();
    }

    public void onAnimateButtonClick(View view) {
        Animation slideUp = new TranslateAnimation(0, 0, 0, -150);
        slideUp.setDuration(500);
        slideUp.setFillAfter(true);

        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(slideUp);

        mario.startAnimation(animationSet);
    }

}