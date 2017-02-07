package yoosanghyeon.overwatchrankser.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Arous on 2017-01-23.
 * data : game_stats
 */

public class GameStatus {

    @SerializedName("damage_done")
    public Integer damageDone;

    @SerializedName("final_blows")
    public Integer finalBlows;

    @SerializedName("healing_done_most_in_game")
    public Integer healingDoneMostInGame;

    @SerializedName("eliminations")
    public Integer eliminations;

    @SerializedName("eliminations_most_in_game")
    public Integer eliminationsMostInGame;

    @SerializedName("time_spent_on_fire_most_in_game")
    public Float timeSpentOnFireMostInGame;

    @SerializedName("deaths")
    public Integer deaths;

    @SerializedName("solo_kills_most_in_game")
    public Integer soloKillsMostInGame;

    @SerializedName("medals_gold")
    public Integer medalsGold;

    @SerializedName("objective_time")
    public Float objectiveTime;

    @SerializedName("cards")
    public Integer cards;

    @SerializedName("medals")
    public Integer medals;

    @SerializedName("teleporter_pads_destroyed")
    public Integer teleporterPadsDestroyed;

    @SerializedName("defensive_assists_most_in_game")
    public Integer defensiveAssistsMostInGame;

    @SerializedName("environmental_deaths")
    public Integer environmentalDeaths;

    @SerializedName("games_won")
    public Integer gamesWon;

    @SerializedName("damage_done_most_in_game")
    public Integer damageDoneMostInGame;

    @SerializedName("melee_final_blows_most_in_game")
    public Integer melee_final_blows_most_in_game;

    @SerializedName("defensive_assists")
    public Integer defensiveAssists;

    @SerializedName("objective_kills_most_in_game")
    public Integer objectiveKillsMostInGame;

    @SerializedName("games_tied")
    public Integer gamesTied;

    @SerializedName("medals_silver")
    public Integer medalsSilver;

    @SerializedName("time_played")
    public Float timePlayed;

    @SerializedName("objective_kills")
    public Integer objectiveKills;

    @SerializedName("offensive_assists")
    public Integer offensiveAssists;

    @SerializedName("melee_final_blows")
    public Integer melee_final_blows;

    @SerializedName("final_blows_most_in_game")
    public Integer finalBlowsMostInGame;

    @SerializedName("objective_time_most_in_game")
    public Float objectiveTimeMostInGame;

    @SerializedName("multikill_best")
    public Integer multikillBest;

    @SerializedName("medals_bronze")
    public Integer medalsBronze;

    @SerializedName("games_lost")
    public Integer gamesLost;

    @SerializedName("multikills")
    public Integer multikills;

    @SerializedName("games_played")
    public Integer gamesPlayed;

    @SerializedName("offensive_assists_most_in_game")
    public Integer offensiveAssistsMostInGame;

    @SerializedName("recon_assists")
    public Integer reconAssists;

    @SerializedName("healing_done")
    public Integer healingDone;

    @SerializedName("solo_kills")
    public Integer soloKills;

    @SerializedName("environmental_kills")
    public Integer environmentalKills;

    @SerializedName("time_spent_on_fire")
    public Float timeSpentOnFire;

    @SerializedName("kpd")
    public Float kpd;

    @Override
    public String toString() {
        return "GameStatus{" +
                "damageDone=" + damageDone +
                ", finalBlows=" + finalBlows +
                ", healingDoneMostInGame=" + healingDoneMostInGame +
                ", eliminations=" + eliminations +
                ", eliminationsMostInGame=" + eliminationsMostInGame +
                ", timeSpentOnFireMostInGame=" + timeSpentOnFireMostInGame +
                ", deaths=" + deaths +
                ", soloKillsMostInGame=" + soloKillsMostInGame +
                ", medalsGold=" + medalsGold +
                ", objectiveTime=" + objectiveTime +
                ", cards=" + cards +
                ", medals=" + medals +
                ", teleporterPadsDestroyed=" + teleporterPadsDestroyed +
                ", defensiveAssistsMostInGame=" + defensiveAssistsMostInGame +
                ", environmentalDeaths=" + environmentalDeaths +
                ", gamesWon=" + gamesWon +
                ", damageDoneMostInGame=" + damageDoneMostInGame +
                ", melee_final_blows_most_in_game=" + melee_final_blows_most_in_game +
                ", defensiveAssists=" + defensiveAssists +
                ", objectiveKillsMostInGame=" + objectiveKillsMostInGame +
                ", gamesTied=" + gamesTied +
                ", medalsSilver=" + medalsSilver +
                ", timePlayed=" + timePlayed +
                ", offensiveAssists=" + offensiveAssists +
                ", melee_final_blows=" + melee_final_blows +
                ", finalBlowsMostInGame=" + finalBlowsMostInGame +
                ", objectiveTimeMostInGame=" + objectiveTimeMostInGame +
                ", multikillBest=" + multikillBest +
                ", medalsBronze=" + medalsBronze +
                ", gamesLost=" + gamesLost +
                ", multikills=" + multikills +
                ", gamesPlayed=" + gamesPlayed +
                ", offensiveAssistsMostInGame=" + offensiveAssistsMostInGame +
                ", reconAssists=" + reconAssists +
                ", healingDone=" + healingDone +
                ", soloKills=" + soloKills +
                ", environmentalKills=" + environmentalKills +
                ", timeSpentOnFire=" + timeSpentOnFire +
                ", kpd=" + kpd +
                '}';
    }
}
