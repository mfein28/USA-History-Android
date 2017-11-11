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
public class Amendments extends Fragment {


    public Amendments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_amendments, container, false);
        Spinner spinner = (Spinner) v.findViewById(R.id.AmendmentSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.OtherAmendments, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                TextView secText = (TextView) v.findViewById(R.id.AmendmentText);
                final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
                if(selected.equals("11th Amendment")){
                    secText.setText(R.string.Amendment11);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("12th Amendment")){
                    secText.setText(R.string.Amendment12);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("13th Amendment")){
                    secText.setText(R.string.Amendment13);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("14th Amendment")){
                    secText.setText(R.string.Amendment14);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("15th Amendment")){
                    secText.setText(R.string.Amendment15);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("16th Amendment")){
                    secText.setText(R.string.Amendment16);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("17th Amendment")){
                    secText.setText(R.string.Amendment17);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("18th Amendment")){
                    secText.setText(R.string.Amendment18);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("19th Amendment")){
                    secText.setText(R.string.Amendment19);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("20th Amendment")){
                    secText.setText(R.string.Amendment20);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("21st Amendment")){
                    secText.setText(R.string.Amendment21);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("22nd Amendment")){
                    secText.setText(R.string.Amendment22);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("23rd Amendment")){
                    secText.setText(R.string.Amendment23);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("24th Amendment")){
                    secText.setText(R.string.Amendment24);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("25th Amendment")){
                    secText.setText(R.string.Amendment25);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("26th Amendment")){
                    secText.setText(R.string.Amendment26);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("27th Amendment")){
                    secText.setText(R.string.Amendment27);
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
