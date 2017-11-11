package com.us.mattfein.ushistory.PresidentsPack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.us.mattfein.ushistory.R;

public class WM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wm);
        setTitle("William McKinley");
        RelativeLayout gwFocus = (RelativeLayout) findViewById(R.id.wmCardFocus);
        final Animation cardslide =  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.carddown);
        gwFocus.startAnimation(cardslide);
    }
}
