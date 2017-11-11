package com.us.mattfein.ushistory.Documents.docproper.usConstitution;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.us.mattfein.ushistory.R;

public class constitution extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constitution);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);



        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        setTitle("The Constitution");
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_constitution, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Preamble preamble = new Preamble();
                    return preamble;
                case 1:
                    ArticleOne articleOne = new ArticleOne();
                    return articleOne;
                case 2:
                    ArticleTwo articleTwo = new ArticleTwo();
                    return articleTwo;
                case 3:
                    ArticleThree articleThree = new ArticleThree();
                    return articleThree;
                case 4:
                    ArticleFour articleFour = new ArticleFour();
                    return articleFour;
                case 5:
                    ArticleFive articleFive = new ArticleFive();
                    return articleFive;
                case 6:
                    ArticleSix articleSix = new ArticleSix();
                    return articleSix;
                case 7:
                    ArticleSeven articleSeven = new ArticleSeven();
                    return articleSeven;
                case 8:
                    BilloRights billoRights = new BilloRights();
                    return billoRights;
                case 9:
                    Amendments amendments = new Amendments();
                    return amendments;
                case 10:
                    conExplain explain = new conExplain();
                    return explain;
            }

            return null;
        }
        @Override
        public int getCount() {
            // Show 3 total pages.
            return 11;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Preamble";
                case 1:
                    return "Article I";
                case 2:
                    return "Article II";
                case 3:
                    return "Article III";
                case 4:
                    return "Article IV";
                case 5:
                    return "Article V";
                case 6:
                    return "Article VI";
                case 7:
                    return "Article VII";
                case 8:
                    return "Bill of\nRights";
                case 9:
                    return "Other\nAmendments";
                case 10:
                    return "Explain";
            }
            return null;
        }
    }
}
