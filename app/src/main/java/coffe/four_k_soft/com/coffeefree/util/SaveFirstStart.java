package coffe.four_k_soft.com.coffeefree.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * Created by goryanskiy on 04.05.18.
 */

public class SaveFirstStart {

    @Retention(RetentionPolicy.SOURCE)
    @StringDef(PREF_USER)
    public @interface Property{}

    private static final String PREF_USER = "pref_user";
    private static SaveFirstStart sInstance = null;
    private static SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    @SuppressLint("CommitPrefEdits")
    private SaveFirstStart(@NonNull Context context) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor = preferences.edit();
    }


    public static synchronized SaveFirstStart from(@NonNull Context context){
        if(null == sInstance){
            initSetting(context);
        }
        return sInstance;
    }

    private static void initSetting(@NonNull Context context){
        sInstance = new SaveFirstStart(context);
    }

    @NonNull
    public static synchronized SaveFirstStart getInstance(){
        return sInstance;
    }


    public String getUser(){
        return preferences.getString(PREF_USER, null);
    }

    @SuppressLint("CommitPrefEdits")
    public void saveUser(String user){
        editor.putString(PREF_USER, user).apply();
    }
}
