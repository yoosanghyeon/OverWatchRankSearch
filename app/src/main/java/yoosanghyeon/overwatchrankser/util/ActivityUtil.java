package yoosanghyeon.overwatchrankser.util;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Arous on 2017-01-06.
 */

public class ActivityUtil {

    public static ActivityUtil activityUtil;

    private ActivityUtil() {
    }

    public static ActivityUtil getInstance() {
        if (activityUtil == null) {
            activityUtil = new ActivityUtil();
        }
        return activityUtil;
    }

    public void replaceToActivityFragment(@NonNull FragmentManager manager, @NonNull Fragment fragment
            , @NonNull int fragmentId) {

        manager.beginTransaction()
                .replace(fragmentId, fragment)
                .commit();
    }



}
