package com.us.mattfein.ushistory.Documents.docproper.Carolina;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;

import com.us.mattfein.ushistory.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CarolinaText extends Fragment {


    public CarolinaText() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_carolina_text, container, false);
        final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
        ScrollView scrollView = (ScrollView) v.findViewById(R.id.scScroll);
        scrollView.startAnimation(slidedown);
        return v;
    }

}
