package com.idealcn.design.study.mvp.loader;

import android.content.Context;
import androidx.loader.content.Loader;

import com.idealcn.design.study.mvp.base.IBasePresenter;
import com.idealcn.design.study.mvp.factory.PresenterFactory;

/**
 * Created by ideal-gn on 2017/9/28.
 */

public class PresenterLoader<P extends IBasePresenter> extends Loader<P> {
    private PresenterFactory<P> factory;
    private P presenter;
    /**
     * Stores away the application context associated with context.
     * Since Loaders can be used across multiple activities it's dangerous to
     * store the context directly; always use {@link #getContext()} to retrieve
     * the Loader's Context, don't use the constructor argument directly.
     * The Context returned by {@link #getContext} is safe to use across
     * Activity instances.
     *
     * @param context used to retrieve the application context.
     */
    public PresenterLoader(Context context, PresenterFactory<P> factory) {
        super(context);
        this.factory = factory;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        if (presenter!=null){
            deliverResult(presenter);
        }else {
            forceLoad();
        }
    }

    @Override
    protected void onForceLoad() {
        super.onForceLoad();
        presenter =  factory.create();
        deliverResult(presenter);
    }

    @Override
    protected void onStopLoading() {
        super.onStopLoading();
        releasePresenter();
    }

    @Override
    protected void onReset() {
        super.onReset();
        releasePresenter();
    }

    private void releasePresenter() {
        if (presenter!=null){
            presenter.unbind();
            presenter = null;
        }
    }
}
