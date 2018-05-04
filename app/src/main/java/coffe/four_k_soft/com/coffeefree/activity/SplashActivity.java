package coffe.four_k_soft.com.coffeefree.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import coffe.four_k_soft.com.coffeefree.R;
import coffe.four_k_soft.com.coffeefree.databinding.ActivitySplashBinding;
import coffe.four_k_soft.com.coffeefree.fragment.FirstStartOneFragment;
import coffe.four_k_soft.com.coffeefree.util.SaveFirstStart;

public class SplashActivity extends AppCompatActivity {
    private static final String TAG = SplashActivity.class.getSimpleName();
    private ActivitySplashBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
    }

    @Override
    protected void onResume() {
        super.onResume();

        new Handler().postDelayed(this::onFirstStart,2000);
    }

    protected void onFirstStart(){
        //Log.i(TAG, "onFirstStart"+SaveFirstStart.getInstance().getUser());
        //if(null == SaveFirstStart.getInstance().getUser()){
            /*Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);*/
        //}else {
            SaveFirstStart.from(getApplicationContext()).saveUser("1");
            getFragmentManager().beginTransaction()
                    .add(R.id.splash_container, new FirstStartOneFragment())
                    .commit();

    }
}