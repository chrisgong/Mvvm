package com.cim120.retrofitstudy.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.cim120.retrofitstudy.R;
import com.cim120.retrofitstudy.view.adapter.ViewPagerAdapter;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends FragmentActivity {

    @ViewById(R.id.container)
    ViewPager container;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        container.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
    }
}
