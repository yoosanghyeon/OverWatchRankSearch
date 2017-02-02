package yoosanghyeon.overwatchrankser.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Arous on 2017-01-23.
 * data : overall_stats
 */

public class OverallStats {

    @SerializedName("prestige")
    public Float prestige;

    @SerializedName("tier")
    public String tier;

    // image
    @SerializedName("avatar")
    public String avatar;

    @SerializedName("comprank")
    public Integer comprank;

    @SerializedName("wins")
    public Integer wins;

    @SerializedName("level")
    public Integer level;

    @SerializedName("games")
    public Integer games;

    @SerializedName("win_rate")
    public Integer winRate;

    @Override
    public String toString() {
        return "OverallStats{" +
                "prestige=" + prestige +
                ", tier='" + tier + '\'' +
                ", avatar='" + avatar + '\'' +
                ", comprank=" + comprank +
                ", wins=" + wins +
                ", level=" + level +
                '}';
    }
}
