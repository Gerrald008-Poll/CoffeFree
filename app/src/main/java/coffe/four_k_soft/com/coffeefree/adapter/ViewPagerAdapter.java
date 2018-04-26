package coffe.four_k_soft.com.coffeefree.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import coffe.four_k_soft.com.coffeefree.fragment.ListProductFragment;

/**
 *
 * Created by goryanskiy on 18.04.18.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }


    public void addFrag(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 2:
                return super.getPageTitle(position);
            default:
                return null;
        }
    }
}
