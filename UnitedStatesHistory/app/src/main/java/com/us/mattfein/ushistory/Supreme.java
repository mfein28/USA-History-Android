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
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.us.mattfein.ushistory.SupremeCourt.eighteensupremedetails;
import com.us.mattfein.ushistory.SupremeCourt.nineteensupremedetails;
import com.us.mattfein.ushistory.SupremeCourt.supremeadapter;
import com.us.mattfein.ushistory.SupremeCourt.suprememodel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Supreme extends Fragment {


    public Supreme() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ListView listView;
        final ArrayList<suprememodel> models18;
        final ArrayList<suprememodel> models19;
        final View rootView = inflater.inflate(R.layout.fragment_supreme, container, false);
        final Animation slideUp = AnimationUtils.loadAnimation(getActivity(), R.anim.listdown);
        final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
        Spinner spinner = (Spinner) rootView.findViewById(R.id.supremespinner);
        listView = (ListView) rootView.findViewById(R.id.listview);
        models18 = eighteensupremedetails.getList();
        models19 = nineteensupremedetails.getList();
        final supremeadapter eighteenAdapter = new supremeadapter(getActivity(), models18);
        final supremeadapter nineteenAdapter = new supremeadapter(getActivity(), models19);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.supreme_century, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                if (selected.equals("18th Century")) {
                    listView.startAnimation(slidedown);
                    listView.setAdapter(eighteenAdapter);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            suprememodel model18 = models18.get(position);
                            if (model18.getSupremeName().equals("marbury")) {
                                listView.startAnimation(slideUp);
                                Intent marbury = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.Marbury.Marbury.class);
                                startActivity(marbury);
                            }
                            if (model18.getSupremeName().equals("mcculloch")) {
                                listView.startAnimation(slideUp);
                                Intent mcculloch = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.McCulloch.McCulloch.class);
                                startActivity(mcculloch);
                            }
                            if (model18.getSupremeName().equals("ogden")) {
                                listView.startAnimation(slideUp);
                                Intent ogden = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.Ogden.Ogden.class);
                                startActivity(ogden);
                            }
                            if (model18.getSupremeName().equals("scott")) {
                                listView.startAnimation(slideUp);
                                Intent scott = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.Dred.DredScott.class);
                                startActivity(scott);
                            }
                            if (model18.getSupremeName().equals("civil")) {
                                listView.startAnimation(slideUp);
                                Intent civil = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.CivilCases.CivilRightsCases.class);
                                startActivity(civil);
                            }
                            if (model18.getSupremeName().equals("plessy")) {
                                listView.startAnimation(slideUp);
                                Intent plessy = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.Plessy.Plessy.class);
                                startActivity(plessy);
                            }
                        }
                    });
                }
                if (selected.equals("19th Century")) {
                    listView.startAnimation(slidedown);
                    listView.setAdapter(nineteenAdapter);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            suprememodel model19 = models19.get(position);

                            if (model19.getSupremeName().equals("securities")) {
                                listView.startAnimation(slideUp);
                                Intent securities = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.Securitiescase.NorthernSecurities.class);
                                startActivity(securities);
                            }
                            if (model19.getSupremeName().equals("lochner")) {
                                listView.startAnimation(slideUp);
                                Intent lochner = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.LochnerNY.Lochner.class);
                                startActivity(lochner);
                            }
                            if (model19.getSupremeName().equals("muller")) {
                                listView.startAnimation(slideUp);
                                Intent muller = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.MullerCase.Muller.class);
                                startActivity(muller);
                            }
                            if (model19.getSupremeName().equals("schenk")) {
                                listView.startAnimation(slideUp);
                                Intent schenck = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.SchenkCase.Schenk.class);
                                startActivity(schenck);
                            }
                            if (model19.getSupremeName().equals("gitlow")) {
                                listView.startAnimation(slideUp);
                                Intent gitlow = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.GitlowNY.Gitlow.class);
                                startActivity(gitlow);
                            }
                            if (model19.getSupremeName().equals("korematsu")) {
                                listView.startAnimation(slideUp);
                                Intent korematsu = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.KorematsuJaps.Korematsu.class);
                                startActivity(korematsu);
                            }
                            if (model19.getSupremeName().equals("brown")) {
                                listView.startAnimation(slideUp);
                                Intent brown = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.BrownEd.Brown.class);
                                startActivity(brown);
                            }
                            if (model19.getSupremeName().equals("gideon")) {
                                listView.startAnimation(slideUp);
                                Intent gideon = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.GideonWainwright.Gideon.class);
                                startActivity(gideon);
                            }
                            if (model19.getSupremeName().equals("escobedo")) {
                                listView.startAnimation(slideUp);
                                Intent escobedo = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.Escobedo.Escobedo.class);
                                startActivity(escobedo);
                            }
                            if (model19.getSupremeName().equals("miranda")) {
                                listView.startAnimation(slideUp);
                                Intent miranda = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.Miranda.Miranda.class);
                                startActivity(miranda);
                            }
                            if (model19.getSupremeName().equals("roe")) {
                                listView.startAnimation(slideUp);
                                Intent roe = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.RoeWade.Roe.class);
                                startActivity(roe);
                            }
                            if (model19.getSupremeName().equals("bush")) {
                                listView.startAnimation(slideUp);
                                Intent bush = new Intent(getActivity(), com.us.mattfein.ushistory.SupremeCourt.SupremeProper.BushGore.BushvGore.class);
                                startActivity(bush);
                            }
                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });


        return rootView;
    }
}

