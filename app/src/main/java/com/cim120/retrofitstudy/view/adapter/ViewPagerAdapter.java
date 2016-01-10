package com.cim120.retrofitstudy.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cim120.retrofitstudy.view.fragment.MovieholderFragment;

/**
 * Created by chrisgong on 16/1/9.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new MovieholderFragment();
    }

    @Override
    public int getCount() {
        return 1;
    }
}