package com.tistory.deque.cardpopuptabsampleproject.CardView;

import android.graphics.drawable.Drawable;
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
import butterknife.OnClick;

public class CardViewActivity extends AppCompatActivity {
    @BindView(R.id.cardViewRecyclerView)
    RecyclerView cardViewRecyclerView;

    public ArrayList<CardContents> cardContents; // 리사이클러 뷰에 적용할 데이터셋
    public ArrayList<Drawable> cats;

    private LinearLayoutManager mLinearLayoutManager;
    private CardViewAdapter cardViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        ButterKnife.bind(this);


        setRecyclerView();

        //고양이 사진들을 미리 초기화
        cats = new ArrayList<>();
        cats.add(getResources().getDrawable(R.drawable.cat_3008775_1280));
        cats.add(getResources().getDrawable(R.drawable.cat_3422439_1280));
        cats.add(getResources().getDrawable(R.drawable.cat_3423417_1280));
        cats.add(getResources().getDrawable(R.drawable.cat_3413505_1280));
    }

    private void setRecyclerView(){
        //리사이클러뷰와 카드뷰를 세팅함
        cardContents = new ArrayList<>();

        mLinearLayoutManager = new LinearLayoutManager(this);
        mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        cardViewRecyclerView.setHasFixedSize(true);
        cardViewRecyclerView.setLayoutManager(mLinearLayoutManager);
        cardViewRecyclerView.setItemAnimator(new DefaultItemAnimator());

        cardViewAdapter = new CardViewAdapter(cardContents);
        cardViewRecyclerView.setAdapter(cardViewAdapter);
    }

    @OnClick(R.id.buttonCardAdd)
    public void cardAdd(){
        //card를 하나 추가
        //고양이 한마리를 순서대로 띄운다
        String title = "TITLE " + cardContents.size();
        String contents = "CONTENTS " + cardContents.size();

        cardContents.add(new CardContents(title, contents, cats.get(cardContents.size() % 4)));

        cardViewAdapter.notifyDataSetChanged();
    }

    @OnClick(R.id.buttonCardRemove)
    public void cardRemove(){
        //index가 0인 카드를 지운다
        //cardViewAdapter.notifyItemRemoved()는 인덱스로 들어온 인자가 지워지면
        //자연스럽게 삭제해주는 애니메이션이 보임
        if(cardContents.size() <= 0) return;

        cardContents.remove(0);
        cardViewAdapter.notifyItemRemoved(0);
    }

}
