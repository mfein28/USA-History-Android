package com.us.mattfein.ushistory.RSS;


import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.customtabs.CustomTabsIntent;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.us.mattfein.ushistory.R;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RssFragment extends Fragment implements AdapterView.OnItemClickListener{

    private ProgressBar progressBar;
    private ListView listView;
    private View view;


    public RssFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_rss, container, false);
            progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
            listView = (ListView) view.findViewById(R.id.newsList);
            listView.setOnItemClickListener(this);
            final SwipeRefreshLayout refresh = (SwipeRefreshLayout) view.findViewById(R.id.swiperefresh);
            refresh.setEnabled(true);
            refresh.setColorSchemeColors(getResources().getColor(R.color.colorAccent), getResources().getColor(R.color.colorPrimary), getResources().getColor(R.color.white));
            refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                @Override
                public void onRefresh() {
                    new refresh().execute("");
                    refresh.setEnabled(false);
                }
            });
            startService();
        } else {
            ViewGroup parent = (ViewGroup) view.getParent();
            parent.removeView(view);
        }
        return view;
    }

    private void startService() {

            Intent intent = new Intent(getActivity(), RssService.class);
            intent.putExtra(RssService.RECEIVER, resultReceiver);
            getActivity().startService(intent);
        }


    private final ResultReceiver resultReceiver = new ResultReceiver(new Handler()) {
        @SuppressWarnings("unchecked")
        @Override
        protected void onReceiveResult(int resultCode, Bundle resultData) {
            List<RssItem> items = (List<RssItem>) resultData.getSerializable(RssService.ITEMS);
            if (items != null) {
                RssAdapter adapter = new RssAdapter(getActivity(), items);
                listView.setAdapter(adapter);
            } else {
                Snackbar.make(getView(), "An error occured while gathering today's news.", Snackbar.LENGTH_INDEFINITE).show();
            }
            progressBar.setVisibility(View.GONE);
            listView.setVisibility(View.VISIBLE);

        };
    };

    private void refreshRssFragment(){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        RssFragment fragment = new RssFragment();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        RssAdapter adapter = (RssAdapter) parent.getAdapter();
        RssItem item = (RssItem) adapter.getItem(position);
        Uri uri = Uri.parse(item.getLink());
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(getActivity(), uri);

    }

    private class refresh extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                return "Interrupted";
            }
            return "Executed";
        }

        @Override
        protected void onPostExecute(String result) {
            refreshRssFragment();
        }
    }
}
