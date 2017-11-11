package com.us.mattfein.ushistory.SupremeCourt.SupremeProper.Ogden;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.us.mattfein.ushistory.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OgdenDec extends Fragment {


    public OgdenDec() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ogden_dec, container, false);
        final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.judgedown);
        ImageView marburyJudge = (ImageView) v.findViewById(R.id.gibbonsjudges);
        marburyJudge.startAnimation(slidedown);
        return v;
    }

}
