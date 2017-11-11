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

public class ArticleExplanation extends Fragment {



    public ArticleExplanation() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_article_explanation, container, false);
        final Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.tooldown);
        Spinner spinner = (Spinner) v.findViewById(R.id.articleExplainSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.articlesexplain, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                TextView articleExplain = (TextView) v.findViewById(R.id.articleExplainText);
                if (selected.equals("Articles I and II")) {
                    articleExplain.setText(R.string.ArticleIIexplain);
                    articleExplain.startAnimation(slidedown);

                }
                if (selected.equals("Articles III and IV")) {
                    articleExplain.setText(R.string.ArticleIIIandIVexplain);
                    articleExplain.startAnimation(slidedown);
                }
                if (selected.equals("Article V")) {
                    articleExplain.setText(R.string.ArticleVexplain);
                    articleExplain.startAnimation(slidedown);
                }
                if (selected.equals("Article VI")) {
                    articleExplain.setText(R.string.ArticleVIexplain);
                    articleExplain.startAnimation(slidedown);
                }
                if (selected.equals("Articles VII and VIII")) {
                    articleExplain.setText(R.string.ArticleVIIandVIIIexplain);
                    articleExplain.startAnimation(slidedown);
                }

                if (selected.equals("Article IX")) {
                    articleExplain.setText(R.string.ArticleIXexplain);
                    articleExplain.startAnimation(slidedown);
                }
                if (selected.equals("Article X")) {
                    articleExplain.setText(R.string.ArticleXexplain);
                    articleExplain.startAnimation(slidedown);
                }
                if (selected.equals("Article XI")) {
                    articleExplain.setText(R.string.ArticleXIexplain);
                    articleExplain.startAnimation(slidedown);
                }
                if (selected.equals("Article XII")) {
                    articleExplain.setText(R.string.ArticleXIIexplain);
                    articleExplain.startAnimation(slidedown);
                }
                if (selected.equals("Article XIII")) {
                    articleExplain.setText(R.string.ArticleXIIIexplan);
                    articleExplain.startAnimation(slidedown);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return v;
    }
}
