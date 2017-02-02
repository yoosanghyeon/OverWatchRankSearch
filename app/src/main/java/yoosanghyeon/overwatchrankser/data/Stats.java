package yoosanghyeon.overwatchrankser.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Arous on 2017-01-23.
 */

public class Stats {

    @SerializedName("quickplay")
    public QuickPlay quickPlay;

    @SerializedName("competitive")
    public Competitive competitive;

    @Override
    public String toString() {
        return "Stats{" +
                "quickPlay=" + quickPlay +
                ", competitive=" + competitive +
                '}';
    }
}
