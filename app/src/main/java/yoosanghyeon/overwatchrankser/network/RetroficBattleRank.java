package yoosanghyeon.overwatchrankser.network;

import retrofit2.Call;
import retrofit2.Retrofit;
import yoosanghyeon.overwatchrankser.data.UserRankResponse;

/**
 * Created by Arous on 2017-01-23.
 */

public class RetroficBattleRank {

    private OverWatchRankService overWatchRankService;
    private static RetroficBattleRank retroficBattleRank;

    public static RetroficBattleRank getInstance(){
        if (retroficBattleRank == null){
            synchronized(RetroficBattleRank.class){
                retroficBattleRank = new RetroficBattleRank();
            }
        }

        return retroficBattleRank;
    }

    private RetroficBattleRank() {
        Retrofit retrofit = RetroficCreator.createRetrofit();
        overWatchRankService = retrofit.create(OverWatchRankService.class);
    }

    public Call<UserRankResponse> searchUserRank(String userBattleTag) {
        return overWatchRankService.searchRank(userBattleTag);
    }
}
