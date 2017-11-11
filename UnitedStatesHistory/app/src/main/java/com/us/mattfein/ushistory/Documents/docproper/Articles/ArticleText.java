package com.us.mattfein.ushistory.Documents.docproper.Articles;

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


public class ArticleText extends Fragment {


    public ArticleText() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_article_text, container, false);
        final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
        Spinner spinner = (Spinner) v.findViewById(R.id.articlesSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.articles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView articletext = (TextView) v.findViewById(R.id.articleText);
                String selected = parent.getItemAtPosition(position).toString();
                if(selected.equals("Preamble")){
                    articletext.setText(R.string.Preambleart);
                    articletext.startAnimation(slidedown);
                }
                if(selected.equals("Article I")){
                    articletext.setText(R.string.ArticleI);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article II")){
                    articletext.setText(R.string.ArticleII);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article III")){
                    articletext.setText(R.string.ArticleIII);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article IV")){
                    articletext.setText(R.string.ArticleIV);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article V")){
                    articletext.setText(R.string.ArticleV);
                    articletext.startAnimation(slidedown);
                }
                if(selected.equals("Article VI")){
                    articletext.setText(R.string.ArticleVI);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article VII")){
                    articletext.setText(R.string.ArticleVII);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article VIII")){
                    articletext.setText(R.string.ArticleVIII);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article IX")){
                    articletext.setText(R.string.ArticleIX);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article X")){
                    articletext.setText(R.string.ArticleX);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article XI")){
                    articletext.setText(R.string.ArticleXI);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article XII")){
                    articletext.setText(R.string.ArticleXII);
                    articletext.startAnimation(slidedown);

                }
                if(selected.equals("Article XIII")){
                    articletext.setText(R.string.ArticleXIII);
                    articletext.startAnimation(slidedown);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return v;
    }




}
