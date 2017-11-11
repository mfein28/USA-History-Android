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
public class BilloRights extends Fragment {


    public BilloRights() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_billo_rights, container, false);
        Spinner spinner = (Spinner) v.findViewById(R.id.BilloRightsSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.BillofRights, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                TextView secText = (TextView) v.findViewById(R.id.BilloRightsText);
                final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
                if(selected.equals("1st Amendment")){
                    secText.setText(R.string.firstAmend);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("2nd Amendment")){
                    secText.setText(R.string.secondAmend);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("3rd Amendment")){
                    secText.setText(R.string.thirdAmend);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("4th Amendment")){
                    secText.setText(R.string.fourthAmend);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("5th Amendment")){
                    secText.setText(R.string.fifthAmend);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("6th Amendment")){
                    secText.setText(R.string.sixthAmend);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("7th Amendment")){
                    secText.setText(R.string.seventhAmend);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("8th Amendment")){
                    secText.setText(R.string.eigthAmend);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("9th Amendment")){
                    secText.setText(R.string.ninthAmend);
                    secText.startAnimation(slidedown);
                }
                if(selected.equals("10th Amendment")){
                    secText.setText(R.string.tenthAmend);
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
