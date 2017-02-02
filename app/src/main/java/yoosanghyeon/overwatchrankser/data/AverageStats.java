package yoosanghyeon.overwatchrankser.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Arous on 2017-01-23.
 * data : average_stats
 */

public class AverageStats {

    @SerializedName("offensive_assists_avg")
    public Integer OffensiveAssistsAvg;

    @SerializedName("damage_done_avg")
    public Integer damageDoneAvg;

    @SerializedName("melee_final_blows_avg")
    public Float meleeFinalBlowsAvg;

    @SerializedName("eliminations_avg")
    public Float eliminationsAvg;

    @SerializedName("time_spent_on_fire_avg")
    public Float timeSpentOnFireAvg;

    @SerializedName("objective_kills_avg")
    public Float objectiveKillsAvg;

    @SerializedName("final_blows_avg")
    public Float finalBlowsAvg;

    @SerializedName("objective_time_avg")
    public Float objectiveTimeAvg;

    @SerializedName("solo_kills_avg")
    public Float soloKillsAvg;

    @SerializedName("recon_assists_avg")
    public Integer reconAssistsAvg;

    @SerializedName("healing_done_avg")
    public Float healingDoneAvg;

    @SerializedName("defensive_assists_avg")
    public Float defensiveAssistsAvg;

    @SerializedName("deaths_avg")
    public Float deathsAvg;

    @Override
    public String toString() {
        return "AverageStats{" +
                "OffensiveAssistsAvg=" + OffensiveAssistsAvg +
                ", damageDoneAvg=" + damageDoneAvg +
                ", meleeFinalBlowsAvg=" + meleeFinalBlowsAvg +
                ", eliminationsAvg=" + eliminationsAvg +
                ", timeSpentOnFireAvg=" + timeSpentOnFireAvg +
                ", objectiveKillsAvg=" + objectiveKillsAvg +
                ", finalBlowsAvg=" + finalBlowsAvg +
                ", objectiveTimeAvg=" + objectiveTimeAvg +
                ", soloKillsAvg=" + soloKillsAvg +
                ", reconAssistsAvg=" + reconAssistsAvg +
                ", healingDoneAvg=" + healingDoneAvg +
                ", defensiveAssistsAvg=" + defensiveAssistsAvg +
                ", deathsAvg=" + deathsAvg +
                '}';
    }
}
