package yoosanghyeon.overwatchrankser;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
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
    int versionCode;
    private static final int LATELY_VERSION_CODE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            versionCode = pInfo.versionCode;
            if (versionCode == 2){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
            }
        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
        }


        toolbar.setTitle("오버워치 전적 검색");


        manager = getSupportFragmentManager();
        ActivityUtil.getInstance().replaceToActivityFragment
                (manager, UserSearchFragment.newInstance(),R.id.fragment_id);

    }

}
