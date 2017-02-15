package yoosanghyeon.overwatchrankser.detailpage.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import yoosanghyeon.overwatchrankser.R;
import yoosanghyeon.overwatchrankser.data.UserRankData;

/**
 * Created by Arous on 2017-01-24.
 */

public class RankItemView extends RecyclerView.ViewHolder {

    Context mContext;

    @BindView(R.id.server_name)
    TextView server_name;

    @BindView(R.id.tire)
    TextView tire;

    @BindView(R.id.score)
    TextView score;

    @BindView(R.id.kandd)
    TextView kandd;

    @BindView(R.id.game_plays)
    TextView game_plays;

    @BindView(R.id.kill_deaths)
    TextView kill_deaths;

    @BindView(R.id.solo_kill_avg)
    TextView solo_kill_avg;

    @BindView(R.id.offense_asists_avg)
    TextView offense_asists_avg;

    @BindView(R.id.final_blows_avg)
    TextView final_blows_avg;

    @BindView(R.id.damage_done_avg)
    TextView damage_done_avg;

    @BindView(R.id.time_spent_on_fire_avg)
    TextView time_spent_on_fire_avg;

    @BindView(R.id.deaths_avg)
    TextView deaths_avg;

    @BindView(R.id.avatar)
    ImageView avata;

    public RankItemView(View itemView, Context mContext) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.mContext = mContext;
        Log.e("ViewHolder_Created","ViewHolder_Created");
    }

    public void bindView(UserRankData data) {


        server_name.setText(""+data.serverName);
        tire.setText(""+data.stats.competitive.overallStats.tier);
        score.setText(""+data.stats.competitive.overallStats.comprank);
        kandd.setText(""+data.stats.competitive.gameStatus.kpd.toString());
        game_plays.setText(""+data.stats.competitive.overallStats.games);
        kill_deaths.setText(
                data.stats.competitive.overallStats.winRate+"%");

        solo_kill_avg.setText(""+solo_kill_avg.getText().toString() +
                data.stats.competitive.averageStats.soloKillsAvg.toString());

        offense_asists_avg.setText(""+offense_asists_avg.getText().toString() +
                data.stats.competitive.averageStats.OffensiveAssistsAvg);

        final_blows_avg.setText(""+final_blows_avg.getText().toString() +
                data.stats.competitive.averageStats.finalBlowsAvg);

        damage_done_avg.setText(""+damage_done_avg.getText().toString() +
                data.stats.competitive.averageStats.damageDoneAvg);

        time_spent_on_fire_avg.setText(""+time_spent_on_fire_avg.getText().toString() +
                data.stats.competitive.averageStats.timeSpentOnFireAvg);

        deaths_avg.setText(""+deaths_avg.getText().toString() +
                data.stats.competitive.averageStats.deathsAvg);

        Glide.with(mContext).
                load(data.stats.competitive.overallStats.avatar).into(avata);


    }
}
