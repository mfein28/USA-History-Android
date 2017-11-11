package com.us.mattfein.ushistory.SupremeCourt;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by mattfein on 7/17/17.
 */

public class suprememodel extends AppCompatActivity{

    private  int imageId;
    private String supremeName;


    public suprememodel(int imageId, String supremeName) {
        this.imageId = imageId;
        this.supremeName = supremeName;


    }

    public int getImageId() {
        return imageId;
    }

    public void setEraName(String eraName){
        this.supremeName = supremeName;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getSupremeName() {
        return supremeName;
    }




}


