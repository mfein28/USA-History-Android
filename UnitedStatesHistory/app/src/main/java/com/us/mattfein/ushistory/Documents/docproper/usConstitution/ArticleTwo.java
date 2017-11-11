package com.us.mattfein.ushistory.Documents.docproper.usConstitution;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.us.mattfein.ushistory.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArticleTwo extends Fragment {


    public ArticleTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_article_two, container, false);
        Spinner spinner = (Spinner) v.findViewById(R.id.artIIspinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.ArticleIISections, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                TextView secText = (TextView) v.findViewById(R.id.articleIItext);
                final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
                if(selected.equals("Section 1")){
                    secText.setText(R.string.Section12);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("Section 2")){
                    secText.setText(R.string.Section22);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("Section 3")){
                    secText.setText(R.string.Section32);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("Section 4")){
                    secText.setText(R.string.Section42);
                    secText.startAnimation(slidedown);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return v;
    }

}
