package yoosanghyeon.overwatchrankser.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Arous on 2017-01-23.
 */

public class Any {
    @SerializedName("stats")
    public Stats stats;

    @Override
    public String toString() {
        return "Any{" +
                "stats=" + stats +
                '}';
    }
}
