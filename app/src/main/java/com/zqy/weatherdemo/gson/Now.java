package com.zqy.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by James on 2017/11/2.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
