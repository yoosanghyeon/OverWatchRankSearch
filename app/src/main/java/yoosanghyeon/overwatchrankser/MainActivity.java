package yoosanghyeon.overwatchrankser;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import yoosanghyeon.overwatchrankser.util.ActivityUtil;
import yoosanghyeon.overwatchrankser.view.UserSearchFragment;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        toolbar.setTitle("오버워치 전적 검색");


        manager = getSupportFragmentManager();
        ActivityUtil.getInstance().replaceToActivityFragment
                (manager, UserSearchFragment.newInstance(),R.id.fragment_id);

    }

}
