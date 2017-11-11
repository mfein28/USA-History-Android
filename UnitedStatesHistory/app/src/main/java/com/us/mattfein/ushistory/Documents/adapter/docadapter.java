package com.us.mattfein.ushistory.Documents.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.us.mattfein.ushistory.Documents.docmodel.docmodel;
import com.us.mattfein.ushistory.R;

import java.util.ArrayList;

public class docadapter extends BaseAdapter{


    private Context context;
    private ArrayList<docmodel> models;

    public docadapter(Context context, ArrayList<docmodel> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = View.inflate(context, R.layout.wars_list, null);
        }
        ImageView images = (ImageView) convertView.findViewById(R.id.WarImage);
        docmodel model = models.get(position);
        images.setImageResource(model.getImageId());




        return convertView;
    }
}
