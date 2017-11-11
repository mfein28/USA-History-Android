package com.us.mattfein.ushistory.SupremeCourt;

import com.us.mattfein.ushistory.R;

import java.util.ArrayList;

/**
 * Created by mattfein on 7/17/17.
 */

public class eighteensupremedetails {


        public static ArrayList<suprememodel> getList(){
            ArrayList<suprememodel> warList = new ArrayList<>();
            warList.add(new suprememodel(R.drawable.marbury, "marbury"));
            warList.add(new suprememodel(R.drawable.mcculloch, "mcculloch"));
            warList.add(new suprememodel(R.drawable.ogden, "ogden"));
            warList.add(new suprememodel(R.drawable.scott, "scott"));
            warList.add(new suprememodel(R.drawable.civilcase, "civil"));
            warList.add(new suprememodel(R.drawable.plessy, "plessy"));
            return warList;
        }
    }

