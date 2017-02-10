package com.example.dllo.abaidumusic.fragment.mainfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.abaidumusic.R;
import com.example.dllo.abaidumusic.fragment.AbsFragment;

/**
 * Created by dllo on 17/2/9.
 * 动态
 */

public class DynamicFragment extends AbsFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(context).inflate(R.layout.fragment_dynamic,container,false);
    }
}
