package id.sch.smktelkom_mlg.privateassignment.xirpl501.movieo.model;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by Vidya on 5/14/2017.
 */

public class terbaik extends SugarRecord implements Serializable {

    public String title;
    public String overview;
    public int color;

    public terbaik() {
    }

    public terbaik(String title, String overview, int color) {
        this.title = title;
        this.overview = overview;
        this.color = color;
    }
}