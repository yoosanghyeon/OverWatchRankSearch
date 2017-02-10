package yoosanghyeon.overwatchrankser.detailpage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import yoosanghyeon.overwatchrankser.R;
import yoosanghyeon.overwatchrankser.data.UserRankData;
import yoosanghyeon.overwatchrankser.detailpage.adapter.RankAdapter;
import yoosanghyeon.overwatchrankser.network.RetroficBattleRank;
import yoosanghyeon.overwatchrankser.presenter.MainContract;
import yoosanghyeon.overwatchrankser.presenter.MainPresenter;

public class DetailActivity extends AppCompatActivity implements MainContract.View {

    @BindView(R.id.detail_toolbar)
    Toolbar detailToolbar;

    @BindView(R.id.rank_detail_recyclerview)
    RecyclerView recyclerView;

    @BindView(R.id.rl_progress_view)
    RelativeLayout rlProgressView;

    // 데이터가 없을때 사용 보여줄 view
    @BindView(R.id.empty_view)
    RelativeLayout emptyView;


    //Search Keyword
    String battleTag;


    private RankAdapter adapter;

    private MainContract.Presenter presenter;

    private LinearLayoutManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        battleTag = getIntent().getStringExtra("tag");
        if (battleTag == null) return;
        detailToolbar.setTitle(battleTag.concat(" 님 경쟁전 전적"));
        setSupportActionBar(detailToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        adapter = new RankAdapter(this);

        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

        presenter = new MainPresenter(RetroficBattleRank.getInstance(), this);
        presenter.loadUserRankr(battleTag);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showProgressbar() {
        rlProgressView.setVisibility(View.VISIBLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        Log.e("showProgressbar", "showProgressbar");
    }

    @Override
    public void hideProgressbar() {
        rlProgressView.setVisibility(View.GONE);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
        Log.e("hideProgressba", "hideProgressba");
    }

    @Override
    public void notifyListview() {
        adapter.notifyDataSetChanged();
        Log.e("notifyListview", "notifyListview");
    }

    @Override
    public void showFaidLoad() {
        Toast.makeText(this, "Load Fail", Toast.LENGTH_SHORT).show();
        Log.e("showFaidLoad", "showFaidLoad");
    }

    @Override
    public void addAllItem(ArrayList<UserRankData> userRankDatas) {
        adapter.addAllItem(userRankDatas);
        Log.e("addAllItem", "addAllItem");

    }

    @Override
    public void addItem(UserRankData data) {
        adapter.addItem(data);
    }

    @Override
    public void showEmptyVIew() {
        emptyView.setVisibility(View.VISIBLE);
    }
}
