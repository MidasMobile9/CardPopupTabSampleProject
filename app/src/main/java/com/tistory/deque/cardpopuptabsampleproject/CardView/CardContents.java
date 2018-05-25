package com.tistory.deque.cardpopuptabsampleproject.CardView;

import android.graphics.drawable.Drawable;

public class CardContents {
    private String title;
    private String contents;
    private Drawable imageDrawable;

    public CardContents(String title, String contents, Drawable imageDrawable) {
        this.title = title;
        this.contents = contents;
        this.imageDrawable = imageDrawable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Drawable getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(Drawable imageDrawable) {
        this.imageDrawable = imageDrawable;
    }
}

