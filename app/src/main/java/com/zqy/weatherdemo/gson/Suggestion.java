package com.zqy.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by James on 2017/11/2.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public CarWash carWash;
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public Sport sport;
    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
