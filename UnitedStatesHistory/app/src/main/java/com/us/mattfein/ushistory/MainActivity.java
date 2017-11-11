package com.us.mattfein.ushistory;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.us.mattfein.ushistory.RSS.RssFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    SwipeRefreshLayout refresh;
    NavigationView navigationView;
    View v, homeView;
    FrameLayout frame;
    AdView ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View layout = findViewById(R.id.appbar);
        frame = (FrameLayout) findViewById(R.id.fragment_container);
        v = getLayoutInflater().inflate(R.layout.fragment_rss, null);
        layout.bringToFront();
        final Animation slidedown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.tooldown);
        ConnectivityManager connectivity = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.bringToFront();
        navigationView.setCheckedItem(R.id.home);
        toolbar.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        MobileAds.initialize(this, "ca-app-pub-9642471534613521~1678203289");
        ad =(AdView) findViewById(R.id.ad);
        AdRequest adRequest = new AdRequest.Builder().build();
        ad.loadAd(adRequest);
        ad.setVisibility(View.VISIBLE);
        if (connectivity != null) {
            addRssFragment();
        }


        FrameLayout frame = (FrameLayout) findViewById(R.id.fragment_container);
        frame.setVisibility(View.VISIBLE);
        frame.startAnimation(slidedown);
    }

    @Override
    public void onBackPressed() {
        FragmentManager manager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else if(frame.getVisibility() == View.VISIBLE) {
            finish();
        }
        else {
            View v = getLayoutInflater().inflate(R.layout.activity_main, null);
            navigationView.setCheckedItem(R.id.home);
            Intent home = new Intent(getApplication(), com.us.mattfein.ushistory.MainActivity.class);
            startActivity(home);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("fragment_added", true);
    }

    private void addRssFragment() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        RssFragment fragment = new RssFragment();
        transaction.add(R.id.fragment_container, fragment);
        transaction.commit();
    }


    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        final Animation slideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.listdown);
        ad.setVisibility(View.GONE);
        if (id == R.id.home) {
            Intent openHome = new Intent(getApplication(), com.us.mattfein.ushistory.MainActivity.class);
            startActivity(openHome);
        }

        if (id == R.id.dayHistory) {
            Intent dayHistory = new Intent(getApplication(), com.us.mattfein.ushistory.TodayHistory.class);
            startActivity(dayHistory);
        } else if (id == R.id.wars) {
            frame.setVisibility(View.GONE);
            WarsFragment openWar = new WarsFragment();
            FragmentManager manager = getSupportFragmentManager();
            setTitle("Wars");
            manager.beginTransaction().replace(R.id.rela, openWar).commit();
        } else if (id == R.id.Documents) {
            frame.setVisibility(View.GONE);
            Constitution constitution = new Constitution();
            FragmentManager manager = getSupportFragmentManager();
            setTitle("Documents");
            manager.beginTransaction().replace(R.id.rela, constitution).commit();
        }
        else if (id == R.id.presidents) {
            frame.setVisibility(View.GONE);
            Presidents presidents = new Presidents();
            FragmentManager manager = getSupportFragmentManager();
            setTitle("US Presidents");
            manager.beginTransaction().replace(R.id.rela, presidents).commit();
        } else if (id == R.id.landmarkSupreme) {
            frame.setVisibility(View.GONE);
            Supreme supreme = new Supreme();
            FragmentManager manager = getSupportFragmentManager();
            setTitle("Supreme Court Cases");
            manager.beginTransaction().replace(R.id.rela, supreme).commit();
        } else if (id == R.id.quiz) {
            Intent quiz = new Intent(getApplication(), com.us.mattfein.ushistory.Quiz.class);
            startActivity(quiz);
            frame.setVisibility(View.GONE);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }

}


