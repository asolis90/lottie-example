package com.asolis.lottieexample;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.example);
        lottieAnimationView.setAnimation("example.json");
        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener()
        {
            @Override
            public void onAnimationStart(Animator animator)
            {

            }

            @Override
            public void onAnimationEnd(Animator animator)
            {
                lottieAnimationView.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator)
            {

            }

            @Override
            public void onAnimationRepeat(Animator animator)
            {

            }
        });

    }
}
