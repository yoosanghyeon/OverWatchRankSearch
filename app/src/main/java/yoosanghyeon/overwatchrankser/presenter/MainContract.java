package yoosanghyeon.overwatchrankser.presenter;

import java.util.ArrayList;

import yoosanghyeon.overwatchrankser.data.UserRankData;

/**
 * Created by Arous on 2017-01-12.
 */

public interface MainContract {
    interface View{
        void showProgressbar();

        void hideProgressbar();

        void notifyListview();

        void showFaidLoad();

        void addItem(UserRankData data);

        void showEmptyVIew();

        void addAllItem(ArrayList<UserRankData> userRankDatas);

    }

    interface Presenter{

        void loadUserRankr(String battleTag);

    }
}
