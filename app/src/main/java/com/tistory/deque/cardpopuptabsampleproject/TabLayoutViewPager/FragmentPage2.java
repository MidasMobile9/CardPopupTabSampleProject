package com.tistory.deque.cardpopuptabsampleproject.TabLayoutViewPager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tistory.deque.cardpopuptabsampleproject.R;

public class FragmentPage2 extends Fragment {
    public static FragmentPage2 newInstance() {

        Bundle args = new Bundle();

        FragmentPage2 fragment = new FragmentPage2();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page_2, container, false);
    }
}
