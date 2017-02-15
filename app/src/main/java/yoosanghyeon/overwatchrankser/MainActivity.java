package yoosanghyeon.overwatchrankser;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import yoosanghyeon.overwatchrankser.common.PropertyManager;
import yoosanghyeon.overwatchrankser.util.ActivityUtil;
import yoosanghyeon.overwatchrankser.view.UpdataDialogFragment;
import yoosanghyeon.overwatchrankser.view.UserSearchFragment;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    FragmentManager manager;
    int versionCode;
    private static final int LATELY_VERSION_CODE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar.setTitle("오버워치 전적 검색");

        if (PropertyManager.getInstance().getCheckVersionOnce()){
            versionCheckUpdateDialog();
        }


        manager = getSupportFragmentManager();
        ActivityUtil.getInstance().replaceToActivityFragment
                (manager, UserSearchFragment.newInstance(null),R.id.fragment_id);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 알람체크 해제
        PropertyManager.getInstance().setCheckVersionOnce(null);
    }

    private void versionCheckUpdateDialog(){
        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            versionCode = pInfo.versionCode;
            if (LATELY_VERSION_CODE > versionCode){
                UpdataDialogFragment newFragment = UpdataDialogFragment.newInstance();
                newFragment.show(getSupportFragmentManager(),"tag");
            }
        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
        }
    }



}
