package com.us.mattfein.ushistory.Wars.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.us.mattfein.ushistory.R;
import com.us.mattfein.ushistory.Wars.cardmodel.Model;

import java.util.ArrayList;

/**
 * Created by mattfein on 7/1/17.
 */

public class waradapter extends BaseAdapter {
    private Context context;
    private ArrayList<Model> models;

    public waradapter(Context context, ArrayList<Model> models) {
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
        Model model = models.get(position);
        images.setImageResource(model.getImageId());
        return convertView;
    }

}
