package yoosanghyeon.overwatchrankser.data;

/**
 * Created by Arous on 2017-01-24.
 */

public class UserRankData {
    public String serverName;
    public Stats stats;

    public UserRankData(String serverName, Stats stats) {
        this.serverName = serverName;
        this.stats = stats;
    }
}
