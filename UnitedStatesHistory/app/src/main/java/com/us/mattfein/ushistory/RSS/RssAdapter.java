package com.us.mattfein.ushistory.RSS;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.us.mattfein.ushistory.R;

import java.util.List;

/**
* Created by mattfein on 7/14/17.
*/

public class RssAdapter extends BaseAdapter {

private final List<RssItem> items;
private final Context context;
    Boolean checkchange;

public RssAdapter(Context context, List<RssItem> items) {
    this.items = items;
    this.context = context;
}

@Override
public int getCount() {
    return items.size();
}

@Override
public Object getItem(int position) {
    return items.get(position);
}

@Override
public long getItemId(int id) {
    return id;
}

@Override
public View getView(int position, View convertView, ViewGroup parent) {
    ViewHolder holder;
    if (convertView == null) {
        convertView = View.inflate(context, R.layout.rssitem, null);
        holder = new ViewHolder();
        holder.itemTitle = (TextView) convertView.findViewById(R.id.itemTitle);
        holder.imagedesc = (ImageView) convertView.findViewById(R.id.news);
        convertView.setTag(holder);
    } else {
        holder = (ViewHolder) convertView.getTag();
    }
        checkchange = false;
        holder.itemTitle.setText(items.get(position).getTitle());
        if(items.get(position).getTitle().contains("Trump")|| items.get(position).getTitle().contains("Russia") && checkchange == false) {
            holder.imagedesc.setImageResource(R.drawable.blanktrump);
            checkchange = true;
        }
        if(items.get(position).getTitle().contains("health") || items.get(position).getTitle().contains("doctor") || items.get(position).getTitle().contains("Health") || items.get(position).getTitle().contains("care")&& checkchange == false){
            holder.imagedesc.setImageResource(R.drawable.blankhealth);
            checkchange = true;
        }

        if(items.get(position).getTitle().contains("weather") || items.get(position).getTitle().contains("Hurricane")|| items.get(position).getTitle().contains("climate")|| items.get(position).getTitle().contains("hottest") || items.get(position).getTitle().contains("storm")|| items.get(position).getTitle().contains("hurricane")&& checkchange == false){
            holder.imagedesc.setImageResource(R.drawable.weather);
            checkchange = true;
        }
        if(items.get(position).getTitle().contains("battle") || items.get(position).getTitle().contains("Korea")|| items.get(position).getTitle().contains("bomb")|| items.get(position).getTitle().contains("missile")|| items.get(position).getTitle().contains("Iraq") || items.get(position).getTitle().contains("Syria") || items.get(position).getTitle().contains("Army")|| items.get(position).getTitle().contains("war")|| items.get(position).getTitle().contains("War") && checkchange == false){
            holder.imagedesc.setImageResource(R.drawable.military);
            checkchange = true;
        }
        if(items.get(position).getTitle().contains("police") || items.get(position).getTitle().contains("protest") || items.get(position).getTitle().contains("arrested")&& checkchange == false) {
            holder.imagedesc.setImageResource(R.drawable.police);
            checkchange = true;
        }
        if(items.get(position).getTitle().contains("gun") || items.get(position).getTitle().contains("shot")|| items.get(position).getTitle().contains("shooting")|| items.get(position).getTitle().contains("NRA")|| items.get(position).getTitle().contains("shot") && checkchange == false){
            holder.imagedesc.setImageResource(R.drawable.gun);
            checkchange = true;
        }
        if(items.get(position).getTitle().contains("education") || items.get(position).getTitle().contains("school")|| items.get(position).getTitle().contains("DeVos")|| items.get(position).getTitle().contains("Education")|| items.get(position).getTitle().contains("teacher") || items.get(position).getTitle().contains("Teacher") && checkchange == false){
            holder.imagedesc.setImageResource(R.drawable.school);
            checkchange = true;
        }
        if(items.get(position).getTitle().contains("money") || items.get(position).getTitle().contains("budget")|| items.get(position).getTitle().contains("market")|| items.get(position).getTitle().contains("Wall Street")|| items.get(position).getTitle().contains("spend") || items.get(position).getTitle().contains("cuts") || items.get(position).getTitle().contains("tax") || items.get(position).getTitle().contains("bank")&& checkchange == false){
            holder.imagedesc.setImageResource(R.drawable.money);
            checkchange = true;
        }
        if(checkchange != true && items.get(position).getTitle().contains("Silicon") || items.get(position).getTitle().contains("Apple")|| items.get(position).getTitle().contains("Google")|| items.get(position).getTitle().contains("hack")|| items.get(position).getTitle().contains("tech") || items.get(position).getTitle().contains("internet")){
            holder.imagedesc.setImageResource(R.drawable.tech);
            checkchange = true;
        }
        if(items.get(position).getTitle().contains("guilty") || items.get(position).getTitle().contains("verdict")|| items.get(position).getTitle().contains("court")|| items.get(position).getTitle().contains("judge")|| items.get(position).getTitle().contains("pleads") || items.get(position).getTitle().contains("decision") || items.get(position).getTitle().contains("lawyer") || items.get(position).getTitle().contains("suit") || items.get(position).getTitle().contains("jury")|| items.get(position).getTitle().contains("trial") || items.get(position).getTitle().contains("sue") && checkchange == false){
            holder.imagedesc.setImageResource(R.drawable.judge);
            checkchange = true;
        }
        if(items.get(position).getTitle().contains("rally") || items.get(position).getTitle().contains("protest")|| items.get(position).getTitle().contains("riot")|| items.get(position).getTitle().contains("Protest")|| items.get(position).getTitle().contains("strike") || items.get(position).getTitle().contains("mob") || items.get(position).getTitle().contains("Riot") || items.get(position).getTitle().contains("Rally") || items.get(position).getTitle().contains("march")|| items.get(position).getTitle().contains("March") && checkchange == false){
            holder.imagedesc.setImageResource(R.drawable.protest);
            checkchange = true;
        }
        if(items.get(position).getTitle().contains("jail") || items.get(position).getTitle().contains("prison")|| items.get(position).getTitle().contains("arrest")|| items.get(position).getTitle().contains("Prison")|| items.get(position).getTitle().contains("Jail") || items.get(position).getTitle().contains("Arrest") && checkchange == false){
            holder.imagedesc.setImageResource(R.drawable.jail);
            checkchange = true;
        }
        if(items.get(position).getTitle().contains("legislate") || items.get(position).getTitle().contains("bill")|| items.get(position).getTitle().contains("Congress")|| items.get(position).getTitle().contains("Senate")|| items.get(position).getTitle().contains("signs") || items.get(position).getTitle().contains("congress") || items.get(position).getTitle().contains("senate") || items.get(position).getTitle().contains("Act") || items.get(position).getTitle().contains("Legislate")|| items.get(position).getTitle().contains("sign") || items.get(position).getTitle().contains("House") && checkchange == false){
            holder.imagedesc.setImageResource(R.drawable.legislate);
            checkchange = true;
        }
        else if (checkchange != true){
            holder.imagedesc.setImageResource(R.drawable.statue);
        }
    return convertView;
}




static class ViewHolder {
    TextView itemTitle;
    ImageView imagedesc;
}
}

