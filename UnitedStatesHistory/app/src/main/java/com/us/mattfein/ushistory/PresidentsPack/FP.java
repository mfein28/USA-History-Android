package com.us.mattfein.ushistory.PresidentsPack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.us.mattfein.ushistory.R;

public class FP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fp);
        setTitle("Franklin Pierce");
        RelativeLayout gwFocus = (RelativeLayout) findViewById(R.id.fpCardFocus);
        final Animation cardslide =  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.carddown);
        gwFocus.startAnimation(cardslide);
    }
}
