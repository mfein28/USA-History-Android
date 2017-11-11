package com.us.mattfein.ushistory.Wars.cardmodel;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by mattfein on 7/1/17.
 */

public class Model extends AppCompatActivity{
    private  int imageId;
    private String warName;
    private String dates;


    public Model(int imageId, String warName) {
        this.imageId = imageId;
        this.warName = warName;

    }


    public int getImageId() {
        return imageId;
    }

    public void setWarName(String warName){
        this.warName = warName;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getWarName() {
        return warName;
    }



}
