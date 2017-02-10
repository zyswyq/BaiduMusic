package com.example.dllo.abaidumusic.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.abaidumusic.R;

/**
 * Created by dllo on 17/2/9.
 * 由于主要显示的Fragment
 */

public class MainFragment extends AbsFragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(context).inflate(R.layout.fragment_main,container,false);
    }
}
