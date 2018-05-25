package com.tistory.deque.cardpopuptabsampleproject.TabLayoutViewPager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tistory.deque.cardpopuptabsampleproject.R;

public class FragmentPage3 extends Fragment {
    public static FragmentPage3 newInstance() {
        
        Bundle args = new Bundle();
        
        FragmentPage3 fragment = new FragmentPage3();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page_3, container, false);
    }
}
