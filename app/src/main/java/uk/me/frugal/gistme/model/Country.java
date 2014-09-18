package uk.me.frugal.gistme.model;

import android.content.Context;

/**
 * Created by chris on 12/09/2014.
 */
public class Country {

    public String name;
    public String description;
    public String imageName;


    public int getImageResourceId(Context context)
    {
        try {
            return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
