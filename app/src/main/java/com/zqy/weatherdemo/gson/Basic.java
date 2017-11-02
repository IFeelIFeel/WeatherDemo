package com.zqy.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by James on 2017/11/2.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
