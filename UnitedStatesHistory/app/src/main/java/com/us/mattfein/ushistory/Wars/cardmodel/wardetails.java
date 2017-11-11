package com.us.mattfein.ushistory.Wars.cardmodel;

import com.us.mattfein.ushistory.R;

import java.util.ArrayList;

/**
 * Created by mattfein on 7/1/17.
 */

public class wardetails {

public static ArrayList<Model> getList(){
    ArrayList<Model> warList = new ArrayList<>();
    warList.add(new Model(R.drawable.rev, "Rev"));
    warList.add(new Model(R.drawable.eighteentwelve, "1812"));
    warList.add(new Model(R.drawable.mexican, "Mexican"));
    warList.add(new Model(R.drawable.civil, "Civil"));
    warList.add(new Model(R.drawable.spanish, "Spanish"));
    warList.add(new Model(R.drawable.wwi, "wwi"));
    warList.add(new Model(R.drawable.wwii, "wwii"));
    warList.add(new Model(R.drawable.korea, "korea"));
    warList.add(new Model(R.drawable.vietnam, "vietnam"));
    warList.add(new Model (R.drawable.gulf, "gulf"));
    warList.add(new Model(R.drawable.afghanistan, "afghan"));
    warList.add(new Model(R.drawable.iraq, "iraq"));
    return warList;
 }
}
