package com.tistory.deque.cardpopuptabsampleproject.CardView;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tistory.deque.cardpopuptabsampleproject.R;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {
    private ArrayList<CardContents> cardContentsList;

    public CardViewAdapter(ArrayList<CardContents> cardContentsList) {
        //리사이클러 뷰의 데이터셋으로 사용될 자료구조를 인자로 넘겨줌
        this.cardContentsList = cardContentsList;
    }

    @NonNull
    @Override
    public CardViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //리사이클러 뷰로 보여질 뷰그룹을 inflate로 설정
        //그 뷰그룹을 반환
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewAdapter.ViewHolder holder, int position) {
        //인자의 ViewHolder를 현재 클래스 내부 static 클래스인 CardViewAdapter.ViewHolder로 줘야함
        //리사이클러뷰에 적용되는 뷰그룹에 들어가는 요소들의 변화를 여기서 정의
        holder.TitleTextView.setText(cardContentsList.get(position).getTitle());
        holder.imageView.setImageDrawable(cardContentsList.get(position).getImageDrawable());
        holder.ContentsTextView.setText(cardContentsList.get(position).getContents());
    }

    @Override
    public int getItemCount() {
        return cardContentsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        //리사이클러뷰에 적용되는 뷰그룹에 들어가는 여러가지 요소들을 여기서 정의
        public TextView TitleTextView;
        public TextView ContentsTextView;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            TitleTextView = itemView.findViewById(R.id.cardTitleTextView);
            ContentsTextView = itemView.findViewById(R.id.cardContentsTextView);
            imageView = itemView.findViewById(R.id.cardImageView);
        }
    }
}
