package com.us.mattfein.ushistory.Wars.Revolution;


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
public class revbattle extends Fragment {

    YouTubePlayer youTuberPlayer;

    public revbattle() {
        // Required empty public constructor
    }


    private static final String API_Key = "AIzaSyCmM2q0r2iKgGfPEkYJ9q1JKWv0BtdKiDg";
    private static String VIDEO_ID = "3EiSymRrKI4";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_revbattle, container, false);
        return v;
    }




}