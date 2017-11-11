package com.us.mattfein.ushistory;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;

import com.us.mattfein.ushistory.Wars.adapter.waradapter;
import com.us.mattfein.ushistory.Wars.cardmodel.Model;
import com.us.mattfein.ushistory.Wars.cardmodel.wardetails;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WarsFragment extends Fragment {


    public WarsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ListView listView;
        final ArrayList<Model> models;
        final View rootView = inflater.inflate(R.layout.fragment_wars, container, false);
        final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
        listView = (ListView) rootView.findViewById(R.id.listview);
        listView.startAnimation(slidedown);
        models = wardetails.getList();
        waradapter warAdapter = new waradapter(getActivity(), models);
        listView.setAdapter(warAdapter);

        final Animation slideUp =  AnimationUtils.loadAnimation(getActivity(), R.anim.listdown);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Model model = models.get(position);
                if(model.getWarName() == "Rev"){
                    listView.startAnimation(slideUp);
                    Intent rev = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.Revolution.rev.class);
                    startActivity(rev);
                }

                if(model.getWarName() == "1812"){
                    listView.startAnimation(slideUp);
                    Intent eighteen = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.eighteentwelve.eighteen.class);
                    startActivity(eighteen);

                }
                if(model.getWarName() == "Mexican"){
                    listView.startAnimation(slideUp);
                    Intent mexican = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.mexican.mexican.class);
                    startActivity(mexican);
                }
                if(model.getWarName() == "Civil"){
                    listView.startAnimation(slideUp);
                    Intent civil = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.Civil.civil.class);
                    startActivity(civil);

                }
                if(model.getWarName() == "Spanish"){
                    listView.startAnimation(slideUp);
                    Intent span = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.Spanish.span.class);
                    startActivity(span);
                }
                if(model.getWarName() == "wwi"){
                    listView.startAnimation(slideUp);
                    Intent wwi = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.WWI.wwi.class);
                    startActivity(wwi);
                }
                if(model.getWarName() == "wwii"){
                    listView.startAnimation(slideUp);
                    Intent wwii = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.WWII.wwii.class);
                    startActivity(wwii);
                }
                if(model.getWarName() == "korea"){
                    listView.startAnimation(slideUp);
                    Intent korea = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.Korea.korea.class);
                    startActivity(korea);
                }
                if(model.getWarName() == "vietnam"){
                    listView.startAnimation(slideUp);
                    Intent vietnam = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.Vietnam.nam.class);
                    startActivity(vietnam);
                }
                if(model.getWarName() == "gulf"){
                    listView.startAnimation(slideUp);
                    Intent gulf = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.Gulf.gulf.class);
                    startActivity(gulf);

                }
                if(model.getWarName() == "afghan"){
                    listView.startAnimation(slideUp);
                    Intent afghan = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.Afghan.afghan.class);
                    startActivity(afghan);
                }
                if(model.getWarName() == "iraq"){
                    listView.startAnimation(slideUp);
                    Intent iraq = new Intent(getActivity(), com.us.mattfein.ushistory.Wars.Iraq.iraq.class);
                    startActivity(iraq);
                }


            }
        });
        return rootView;
    }



}
