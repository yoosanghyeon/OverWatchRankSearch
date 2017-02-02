package yoosanghyeon.overwatchrankser.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Arous on 2017-01-23.
 */

public class Kr {
    @SerializedName("stats")
    public Stats stats;

    @Override
    public String toString() {
        return "Kr{" +
                "stats=" + stats +
                '}';
    }
}
