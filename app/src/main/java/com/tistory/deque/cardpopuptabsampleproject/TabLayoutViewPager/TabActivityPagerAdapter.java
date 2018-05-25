package com.tistory.deque.cardpopuptabsampleproject.TabLayoutViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabActivityPagerAdapter extends FragmentPagerAdapter {
    private static int maxPage = 3;

    private FragmentManager fm;

    public TabActivityPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {
        //position에 해당하는 페이지에 보여줄 프래그먼트를 리턴
        Fragment frag = null;
        switch (position){
            case 0:
                frag = FragmentPage1.newInstance();
                break;
            case 1:
                frag = FragmentPage2.newInstance();
                break;
            case 2:
                frag = FragmentPage3.newInstance();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return maxPage;
    }
}
