package yoosanghyeon.overwatchrankser.detailpage.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import yoosanghyeon.overwatchrankser.R;
import yoosanghyeon.overwatchrankser.data.UserRankData;
import yoosanghyeon.overwatchrankser.detailpage.adapter.viewholder.RankItemView;

/**
 * Created by Arous on 2017-01-24.
 */

public class RankAdapter extends RecyclerView.Adapter<RankItemView> {

    List<UserRankData> userRankDatas = new ArrayList<>();

    Context mContext;

    public RankAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public RankItemView onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.rank_user_item, parent, false);
        return new RankItemView(view, mContext);
    }

    @Override
    public void onBindViewHolder(RankItemView holder, int position) {
        if (getItem(position) != null){
            holder.bindView(getItem(position));
        }
    }

    @Override
    public int getItemCount() {
        return userRankDatas.size();
    }

    public UserRankData getItem(int postion) {
        return userRankDatas.get(postion);
    }

    public void addItem(UserRankData data) {
        userRankDatas.add(data);
    }

    public void addAllItem(ArrayList<UserRankData> userRankDatas) {
        userRankDatas.addAll(userRankDatas);
    }

    public void notifyDataItem() {
        notifyDataSetChanged();
    }


}
