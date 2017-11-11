package com.us.mattfein.ushistory.PresidentsPack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.us.mattfein.ushistory.R;

public class GW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gw);
        setTitle("George Washington");
        RelativeLayout gwFocus = (RelativeLayout) findViewById(R.id.gwCardfocus);
        final Animation cardslide =  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.carddown);
        gwFocus.startAnimation(cardslide);
    }
}
