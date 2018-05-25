package com.tistory.deque.cardpopuptabsampleproject.TabLayoutViewPager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tistory.deque.cardpopuptabsampleproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabLayoutViewPagerActivity extends AppCompatActivity {
    @BindView(R.id.mainViewPager)
    ViewPager mainViewPager;

    @BindView(R.id.mainTapLayout)
    TabLayout mainTapLayout;

    TabActivityPagerAdapter mainPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_view_pager);

        ButterKnife.bind(this);

        //뷰페이저 어뎁터 및 페이지 변경 리스너 설정
        mainPagerAdapter = new TabActivityPagerAdapter(getSupportFragmentManager());
        mainViewPager.setAdapter(mainPagerAdapter);
        mainViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mainTapLayout));

        //탭 레이아웃이 변경되었을 때의 행동을 설정
        mainTapLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //탭이 선택되었을 때의 행동
                mainViewPager.setCurrentItem(tab.getPosition());
                //선택된 탭의 포지션을 뷰페이저의 어댑터에 전달하고
                //어댑터에서 그 포지션에 해당하는 fragment를 리턴해주면 그것이 보여지게 됨.
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
