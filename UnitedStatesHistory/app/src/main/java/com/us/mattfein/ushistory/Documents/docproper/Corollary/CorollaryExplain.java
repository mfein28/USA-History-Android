package com.us.mattfein.ushistory.Documents.docproper.Corollary;


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
public class CorollaryExplain extends Fragment {


    public CorollaryExplain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_corollary_explain, container, false);
        final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
        ScrollView scrollView = (ScrollView) v.findViewById(R.id.corollaryExpScroll);
        scrollView.startAnimation(slidedown);
        return v;
    }

}
