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

import com.us.mattfein.ushistory.Documents.adapter.docadapter;
import com.us.mattfein.ushistory.Documents.docmodel.docdetails;
import com.us.mattfein.ushistory.Documents.docmodel.docmodel;
import com.us.mattfein.ushistory.Documents.docproper.Corollary.corollary;

import java.util.ArrayList;


public class Constitution extends Fragment {


        public Constitution() {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            final ListView listView;
            final ArrayList<docmodel> models;
            final View rootView = inflater.inflate(R.layout.fragment_constitution, container, false);
            final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
            listView = (ListView) rootView.findViewById(R.id.listview);
            models = docdetails.getList();
            listView.startAnimation(slidedown);
            docadapter apdat = new docadapter(getActivity(), models);
            listView.setAdapter(apdat);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    docmodel model = models.get(position);
                    final Animation slideUp =  AnimationUtils.loadAnimation(getActivity(), R.anim.listdown);
                    if(model.getEraName() == "declaration"){
                        listView.startAnimation(slideUp);
                        Intent declaration = new Intent(getActivity(), com.us.mattfein.ushistory.Documents.docproper.Declaration.declaration.class);
                        startActivity(declaration);
                    }
                    if(model.getEraName() == "articles"){
                        listView.startAnimation(slideUp);
                        Intent articles = new Intent(getActivity(), com.us.mattfein.ushistory.Documents.docproper.Articles.articles.class);
                        startActivity(articles);

                    }
                    if(model.getEraName() == "constitution"){
                        listView.startAnimation(slideUp);
                        Intent constitution = new Intent(getActivity(), com.us.mattfein.ushistory.Documents.docproper.usConstitution.constitution.class);
                        startActivity(constitution);
                    }
                    if(model.getEraName() == "carolina"){
                        listView.startAnimation(slideUp);
                        Intent carolina = new Intent(getActivity(), com.us.mattfein.ushistory.Documents.docproper.Carolina.carolina.class);
                        startActivity(carolina);

                    }
                    if(model.getEraName() == "gettysburg"){
                        listView.startAnimation(slideUp);
                        Intent gettysburg = new Intent(getActivity(), com.us.mattfein.ushistory.Documents.docproper.Gettysburg.gettysburg.class);
                        startActivity(gettysburg);
                    }
                    if(model.getEraName() == "emancipation"){
                        listView.startAnimation(slideUp);
                        Intent emancipation = new Intent(getActivity(), com.us.mattfein.ushistory.Documents.docproper.Emancipation.emancipation.class);
                        startActivity(emancipation);
                    }
                    if(model.getEraName() == "corollary"){
                        listView.startAnimation(slideUp);
                        Intent rooscorollary = new Intent(getActivity(), corollary.class);
                        startActivity(rooscorollary);
                    }
                    if(model.getEraName() == "zimmerman"){
                        listView.startAnimation(slideUp);
                        Intent zimmerman = new Intent(getActivity(), com.us.mattfein.ushistory.Documents.docproper.ZimmNote.zimmerman.class);
                        startActivity(zimmerman);
                    }
                    if(model.getEraName() == "truman"){
                        listView.startAnimation(slideUp);
                        Intent truman = new Intent(getActivity(), com.us.mattfein.ushistory.Documents.docproper.TrumanDoc.truman.class);
                        startActivity(truman);

                    }
                    if(model.getEraName() == "marshall"){
                        listView.startAnimation(slideUp);
                        Intent marshallplan = new Intent(getActivity(), com.us.mattfein.ushistory.Documents.docproper.Marshall.marshallplan.class);
                        startActivity(marshallplan);

                    }
                    if(model.getEraName() == "mlk"){
                        listView.startAnimation(slideUp);
                        Intent mlk = new Intent(getActivity(), com.us.mattfein.ushistory.Documents.docproper.Ihaveadream.mlk.class);
                        startActivity(mlk);
                    }


                }
            });
            return rootView;
        }

    }


