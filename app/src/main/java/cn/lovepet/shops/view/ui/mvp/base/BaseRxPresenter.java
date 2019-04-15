package cn.lovepet.shops.view.ui.mvp.base;

import android.content.Context;

import cn.lovepet.shops.base.baserx.RxManager;


/**
 * 基类presenter—02
 */
public abstract class BaseRxPresenter<T,E>{
    public Context mContext;
    public T mView;
    public E mModel;
    public RxManager mRxManager = new RxManager();

    public void setVM(T v, E m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }
    public void onStart(){
    };
    public void onDestroy() {
        mRxManager.clear();
    }
}
