package com.tistory.deque.cardpopuptabsampleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tistory.deque.cardpopuptabsampleproject.CardView.CardViewActivity;
import com.tistory.deque.cardpopuptabsampleproject.TabLayoutViewPager.TabLayoutViewPagerActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick({R.id.buttonTabActivity, R.id.buttonCardViewActivity})
    public void onButtonTabActivityClick(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.buttonTabActivity:
                intent = new Intent(this, TabLayoutViewPagerActivity.class);
                break;
            case R.id.buttonCardViewActivity:
                intent = new Intent(this, CardViewActivity.class);
                break;
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}
