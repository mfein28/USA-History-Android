package com.us.mattfein.ushistory.Documents.docproper.Declaration;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;

import com.us.mattfein.ushistory.R;

public class DeclarationExplain extends Fragment {

    public DeclarationExplain() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_declaration_explain, container, false);
        final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
        ScrollView scrollView = (ScrollView) v.findViewById(R.id.decexplainscroll);
        scrollView.startAnimation(slidedown);
        return v;

    }
}
