package com.us.mattfein.ushistory.SupremeCourt;

import com.us.mattfein.ushistory.R;

import java.util.ArrayList;

/**
 * Created by mattfein on 7/17/17.
 */

public class nineteensupremedetails {


        public static ArrayList<suprememodel> getList(){
            ArrayList<suprememodel> warList = new ArrayList<>();
            warList.add(new suprememodel(R.drawable.securities, "securities"));
            warList.add(new suprememodel(R.drawable.lochner, "lochner"));
            warList.add(new suprememodel(R.drawable.muller, "muller"));
            warList.add(new suprememodel(R.drawable.schenk, "schenk"));
            warList.add(new suprememodel(R.drawable.gitlow, "gitlow"));
            warList.add(new suprememodel(R.drawable.korematsu, "korematsu"));
            warList.add(new suprememodel(R.drawable.brown, "brown"));
            warList.add(new suprememodel(R.drawable.gideon, "gideon"));
            warList.add(new suprememodel(R.drawable.escobedo, "escobedo"));
            warList.add(new suprememodel(R.drawable.miranda, "miranda"));
            warList.add(new suprememodel(R.drawable.roe, "roe"));
            warList.add(new suprememodel(R.drawable.bushgore, "bush"));

            return warList;
        }
    }

