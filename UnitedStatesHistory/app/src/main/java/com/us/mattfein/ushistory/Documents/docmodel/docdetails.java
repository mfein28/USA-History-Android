package com.us.mattfein.ushistory.Documents.docmodel;

import com.us.mattfein.ushistory.R;

import java.util.ArrayList;

/**
 * Created by mattfein on 7/11/17.
 */

public class docdetails{

    public static ArrayList<docmodel> getList(){
        ArrayList<docmodel> warList = new ArrayList<>();
        warList.add(new docmodel(R.drawable.declaration, "declaration"));
        warList.add(new docmodel(R.drawable.articlesconfederation, "articles"));
        warList.add(new docmodel(R.drawable.constitutioncard, "constitution"));
        warList.add(new docmodel(R.drawable.southcarolina, "carolina"));
        warList.add(new docmodel(R.drawable.gettysburg, "gettysburg"));
        warList.add(new docmodel(R.drawable.emancipation, "emancipation"));
        warList.add(new docmodel(R.drawable.corollary, "corollary"));
        warList.add(new docmodel (R.drawable.zimmerman, "zimmerman"));
        warList.add(new docmodel(R.drawable.truman, "truman"));
        warList.add(new docmodel(R.drawable.marshall, "marshall"));
        warList.add(new docmodel(R.drawable.mlk, "mlk"));
        return warList;
    }
}
