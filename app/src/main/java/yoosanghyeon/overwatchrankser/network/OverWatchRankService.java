package yoosanghyeon.overwatchrankser.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import yoosanghyeon.overwatchrankser.data.UserRankResponse;

/**
 * Created by Arous on 2017-01-23.
 */

public interface OverWatchRankService {

    @GET("/api/v3/u/{user}/stats")
    Call<UserRankResponse> searchRank(@Path(value = "user" , encoded = true) String battleTag);
}
