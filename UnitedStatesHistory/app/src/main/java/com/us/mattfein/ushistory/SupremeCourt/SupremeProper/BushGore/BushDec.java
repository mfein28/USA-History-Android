package com.us.mattfein.ushistory.SupremeCourt.SupremeProper.BushGore;


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
public class BushDec extends Fragment {


    public BushDec() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_bush_dec, container, false);
        final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.judgedown);
        ImageView marburyJudge = (ImageView) v.findViewById(R.id.bushjudge);
        marburyJudge.startAnimation(slidedown);
        return v;
    }

}
