package com.us.mattfein.ushistory.Wars.Gulf;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.us.mattfein.ushistory.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GulfBackground extends Fragment {


    public GulfBackground() {
        // Required empty public constructor
    }


    private static final String API_Key = "AIzaSyCmM2q0r2iKgGfPEkYJ9q1JKWv0BtdKiDg";
    private static String VIDEO_ID = "xfWxUA1S8xU";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gulf_background, container, false);
        ImageView countryone = (ImageView) v.findViewById(R.id.countryone);
        ImageView countrytwo = (ImageView) v.findViewById(R.id.countrytwo);
        countryone.setVisibility(View.INVISIBLE);
        countrytwo.setVisibility(View.INVISIBLE);
        YouTubePlayerSupportFragment youTubePlayerFragment = YouTubePlayerSupportFragment.newInstance();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.youtube_layout, youTubePlayerFragment).commit();
        youTubePlayerFragment.initialize(API_Key, new YouTubePlayer.OnInitializedListener() {

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                boolean wasRestored;
                if (!b) {
                    youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                    youTubePlayer.loadVideo(VIDEO_ID);
                }
            }
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
                String errorMessage = error.toString();
                Toast.makeText(getActivity(), errorMessage, Toast.LENGTH_LONG).show();
                Log.d("errorMessage:", errorMessage);
            }
        });

        countryone.setVisibility(View.VISIBLE);
        countrytwo.setVisibility(View.VISIBLE);
        animateCountries(v, countryone, countrytwo);
        return v;
    }

    private void animateCountries(View v, ImageView countryone, ImageView countrytwo){
        final Animation slideinone = AnimationUtils.loadAnimation(getContext(), R.anim.slideinone);
        final Animation slideintwo = AnimationUtils.loadAnimation(getContext(), R.anim.slideintwo);
        countryone.startAnimation(slideintwo);
        countrytwo.startAnimation(slideinone);
    }

}
