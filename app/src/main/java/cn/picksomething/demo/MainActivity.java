package cn.picksomething.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import cn.picksomething.slidingtabindicator.SlidingTabLayout;


public class MainActivity extends AppCompatActivity {

    private static final int TAB_NUM = 5;

    private ViewPager mViewPager;
    private SlidingTabLayout mSlidingTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupViewPagerWithSlidingTab();
    }

    private void findViews() {
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.sliding_tab_layout);
    }

    private void setupViewPagerWithSlidingTab() {
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(pagerAdapter);
        mSlidingTabLayout.setDistributeEvenly(true);
        mSlidingTabLayout.setSelectedIndicatorColors(Color.WHITE);
        mSlidingTabLayout.setViewPager(mViewPager);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PagerFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            return TAB_NUM;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return getString(R.string.pager_title_str, position + 1);
        }
    }
}

