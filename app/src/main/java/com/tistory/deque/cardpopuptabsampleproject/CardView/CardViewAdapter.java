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
        this.cardContentsList = cardContentsList;
    }

    @NonNull
    @Override
    public CardViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewAdapter.ViewHolder holder, int position) {
        holder.TitleTextView.setText(cardContentsList.get(position).getTitle());
        holder.imageView.setImageDrawable(cardContentsList.get(position).getImageDrawable());
        holder.ContentsTextView.setText(cardContentsList.get(position).getContents());
    }

    @Override
    public int getItemCount() {
        return cardContentsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
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
