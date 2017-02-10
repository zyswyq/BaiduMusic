package com.example.dllo.abaidumusic.minterface;

/**
 * Created by dllo on 17/2/10.
 */

public interface CallBack<T> {
    public void  onSuccess(T responce);
    public void  onError(Throwable e);
}
