package yoosanghyeon.overwatchrankser.common;

import android.app.Application;
import android.content.Context;

/**
 * Created by Arous on 2017-02-10.
 */

public class OverSearchApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getOverSearchContext() {
        return mContext;
    }

}
