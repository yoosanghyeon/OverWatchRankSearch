package yoosanghyeon.overwatchrankser.common;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;

/**
 * Created by Arous on 2017-02-10.
 */

public class PropertyManager {

    private static PropertyManager instance;

    SharedPreferences.Editor editor;
    SharedPreferences mPref;

    private static final String VERSION_CHECK_ONCE =
            "version_check_once";

    private PropertyManager() {
        mPref = PreferenceManager
                .getDefaultSharedPreferences(OverSearchApplication.getOverSearchContext());
        editor = mPref.edit();
    }

    public static PropertyManager getInstance() {
        if (instance == null) {
            instance = new PropertyManager();
        }
        return instance;
    }

    public void setCheckVersionOnce(@Nullable String once) {
        editor.putString(VERSION_CHECK_ONCE, once);
        editor.apply();
    }

    public boolean getCheckVersionOnce(){
        String check = mPref.getString(VERSION_CHECK_ONCE, "no");
        return check.equals("no") ? true : false;
    }

}
