package com.tistory.deque.cardpopuptabsampleproject.CardView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tistory.deque.cardpopuptabsampleproject.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CardViewActivity extends AppCompatActivity {
    @BindView(R.id.cardViewRecyclerView)
    RecyclerView cardViewRecyclerView;

    public ArrayList<CardContents> cardContents = new ArrayList<CardContents>();
    private LinearLayoutManager mLinearLayoutManager;
    private CardViewAdapter cardViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        ButterKnife.bind(this);

        setCardContents();
        setRecyclerView();

        cardViewAdapter.notifyDataSetChanged();
    }

    private void setRecyclerView(){
        mLinearLayoutManager = new LinearLayoutManager(this);
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cardViewRecyclerView.setHasFixedSize(true);
        cardViewRecyclerView.setLayoutManager(mLinearLayoutManager);
        cardViewRecyclerView.setItemAnimator(new DefaultItemAnimator());

        cardViewAdapter = new CardViewAdapter(cardContents);
        cardViewRecyclerView.setAdapter(cardViewAdapter);
    }
    private void setCardContents(){
        cardContents.add(new CardContents("TITLE_1", "CONTENTS_1", getResources().getDrawable(R.drawable.cat_3008775_1280)));
        cardContents.add(new CardContents("TITLE_2", "CONTENTS_2", getResources().getDrawable(R.drawable.cat_3422439_1280)));
        cardContents.add(new CardContents("TITLE_3", "CONTENTS_3", getResources().getDrawable(R.drawable.cat_3423417_1280)));
    }
}
