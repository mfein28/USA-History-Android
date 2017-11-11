package com.us.mattfein.ushistory.Documents.docproper.Gettysburg;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.us.mattfein.ushistory.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class gettysburgText extends Fragment {


    public gettysburgText() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gettysburg_text, container, false);
        final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
        RelativeLayout relativeLayout = (RelativeLayout) v.findViewById(R.id.gettyrela);
        relativeLayout.startAnimation(slidedown);
        return v;
    }

}
