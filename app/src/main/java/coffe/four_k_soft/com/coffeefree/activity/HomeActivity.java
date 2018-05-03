package coffe.four_k_soft.com.coffeefree.activity;



import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


import coffe.four_k_soft.com.coffeefree.R;
import coffe.four_k_soft.com.coffeefree.adapter.ViewPagerAdapter;
import coffe.four_k_soft.com.coffeefree.databinding.ActivityHomeBinding;
import coffe.four_k_soft.com.coffeefree.fragment.ListProductFragment;
import coffe.four_k_soft.com.coffeefree.fragment.ShoppingCartFragment;
import coffe.four_k_soft.com.coffeefree.fragment.UserProfileFragment;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = HomeActivity.class.getSimpleName();
    private ActivityHomeBinding binding;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        viewPager = binding.viewPagerHome;
        setupViewPager(viewPager);
        tabLayout = binding.tabLayout;
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
        setupToolBar();
    }

    private void setupToolBar(){
        Toolbar toolbar = findViewById(R.id.toolbar_home);
        setSupportActionBar(toolbar);
        //toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.ic_info));
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_setting:
                        Log.i(TAG, "check on setting icon");
                        Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
                        startActivity(intent);
                }
                return false;
            }
        });
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new ListProductFragment(),"ONE");
        adapter.addFrag(new UserProfileFragment(), "TWO");
        adapter.addFrag(new ShoppingCartFragment(), "THREE");
        viewPager.setAdapter(adapter);
    }
    private void setupTabIcons(){
        int[] tabIcons = {
                R.drawable.ic_selector_list,
                R.drawable.ic_selector_profile,
                R.drawable.ic_selector_shop
        };

        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.btn_setting_novigation, menu);
        return true;
    }
}