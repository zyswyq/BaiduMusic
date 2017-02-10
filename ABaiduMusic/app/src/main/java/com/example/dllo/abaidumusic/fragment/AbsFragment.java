package com.example.dllo.abaidumusic.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by dllo on 17/2/9.
 */

public class AbsFragment extends Fragment{

    protected Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    protected <T extends View> T bindView(int resId) {
        return (T) getView().findViewById(resId);
    }

}
