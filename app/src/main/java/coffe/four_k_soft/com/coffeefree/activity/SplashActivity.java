package coffe.four_k_soft.com.coffeefree.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import coffe.four_k_soft.com.coffeefree.R;
import coffe.four_k_soft.com.coffeefree.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
    }

    @Override
    protected void onResume() {
        super.onResume();
        new Handler().postDelayed(()->{
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        },2000);
    }
}