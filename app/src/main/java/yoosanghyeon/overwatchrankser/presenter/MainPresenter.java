package yoosanghyeon.overwatchrankser.presenter;

import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import yoosanghyeon.overwatchrankser.data.UserRankData;
import yoosanghyeon.overwatchrankser.data.UserRankResponse;
import yoosanghyeon.overwatchrankser.network.RetroficBattleRank;

/**
 * Created by Arous on 2017-01-12.
 * Presenter :: View(Actvity, Adapter) 와 Model(Network :: Retrofic2) 의 연결점
 */

public class MainPresenter implements MainContract.Presenter{

    private RetroficBattleRank retroficBattleRank;
    private MainContract.View view;


    public MainPresenter(RetroficBattleRank retroficBattleRank, MainContract.View view) {
        this.retroficBattleRank = retroficBattleRank;
        this.view = view;
    }

    @Override
    public void loadUserRankr(String battleTag) {
        view.showProgressbar();
        
        Call<UserRankResponse> userRankResponseCall = retroficBattleRank.searchUserRank(battleTag);
        userRankResponseCall.enqueue(new Callback<UserRankResponse>() {
            @Override
            public void onResponse(Call<UserRankResponse> call, Response<UserRankResponse> response) {

                if (!response.isSuccessful()) {
                    view.showFaidLoad();
                    view.hideProgressbar();
                    return;
                }

                UserRankResponse userRankResponse = response.body();
                ArrayList<UserRankData> userRankData = new ArrayList<>();
                if (userRankResponse != null ){
                    if (userRankResponse.kr != null){
                        if (userRankResponse.kr.stats.competitive != null && userRankResponse.kr.stats.competitive.competitive)                        {
                            userRankData.add(new UserRankData("아시아", userRankResponse.kr.stats));
                            view.addItem(new UserRankData("아시아", userRankResponse.kr.stats));
                            Log.e("kr_response", userRankResponse.kr.toString());
                        }
                    }

                    if (userRankResponse.eu != null){
                        if (userRankResponse.eu.stats.competitive != null && userRankResponse.eu.stats.competitive.competitive){
                            userRankData.add(new UserRankData("유럽" , userRankResponse.eu.stats));
                            view.addItem(new UserRankData("유럽" , userRankResponse.eu.stats));
                            Log.e("eu_response", userRankResponse.eu.toString());
                        }
                    }

                    if (userRankResponse.us != null && userRankResponse.us.stats.competitive.competitive){
                        userRankData.add(new UserRankData("북미" , userRankResponse.us.stats));
                        view.addItem(new UserRankData("북미" , userRankResponse.us.stats));
                        Log.e("us_response", userRankResponse.us.toString());
                    }

                    if (userRankResponse.any!= null && userRankResponse.us.stats.competitive.competitive){
                        userRankData.add(new UserRankData("기타" , userRankResponse.us.stats));
                        Log.e("any_response", userRankResponse.any.toString());
                    }


                }

                view.notifyListview();
                view.hideProgressbar();
                // emptyView
                if (userRankData.size() == 0) {
                    view.showEmptyVIew();
                }
            }

            @Override
            public void onFailure(Call<UserRankResponse> call, Throwable t) {
                view.hideProgressbar();
                view.showFaidLoad();
                Log.e("NetworkFail", t.getCause().toString());

            }
        });

    }



}
