package yoosanghyeon.overwatchrankser.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Arous on 2017-01-23.
 */

public class Competitive {
    @SerializedName("average_stats")
    public AverageStats averageStats;

    @SerializedName("overall_stats")
    public OverallStats overallStats;

    @SerializedName("game_stats")
    public GameStatus gameStatus;

    @SerializedName("competitive")
    public boolean competitive;

    @Override
    public String toString() {
        return "Competitive{" +
                "averageStats=" + averageStats +
                ", overallStats=" + overallStats +
                ", gameStatus=" + gameStatus +
                ", competitive=" + competitive +
                '}';
    }
}
