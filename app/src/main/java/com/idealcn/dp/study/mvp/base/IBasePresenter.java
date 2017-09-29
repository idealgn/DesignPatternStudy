package com.idealcn.design.study.mvp.base;

import java.lang.ref.WeakReference;

/**
 * Created by ideal-gn on 2017/9/28.
 */

public abstract class IBasePresenter<V extends IBaseView> {
    private WeakReference<V> view;

    public void  bind(V view){
        this.view = new WeakReference<>(view);
    }

    public void unbind(){
        if (view!=null){
            view.clear();
            view = null;
        }
    }

    public V getView(){
        if (view!=null){
            return view.get();
        }
        return null;
    }

}
