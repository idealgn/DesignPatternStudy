package com.idealcn.design.study.mvp.base;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.appcompat.app.AppCompatActivity;

import com.idealcn.design.study.mvp.factory.PresenterFactory;
import com.idealcn.design.study.mvp.loader.PresenterLoader;

/**
 * Created by ideal-gn on 2017/9/28.
 */

public abstract class IBaseActivity<V extends IBaseView,P extends IBasePresenter<V>> extends AppCompatActivity implements IBaseView, LoaderManager.LoaderCallbacks<P> {

    protected P presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        getSupportLoaderManager().initLoader(getLoaderId(),null,this);

    }

    protected abstract int getLayout();

    protected abstract int getLoaderId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            presenter.unbind();
        }
    }

    @Override
    public Loader<P> onCreateLoader(int id, Bundle args) {
        return new PresenterLoader<>(this, new PresenterFactory<P>() {
            @Override
            public P create() {
                return createPresenter();
            }
        });
    }

    protected abstract P createPresenter();

    @Override
    public void onLoadFinished(Loader<P> loader, P data) {
       this.presenter = data;
        this.presenter.bind((V) this);
    }

    @Override
    public void onLoaderReset(Loader<P> loader) {

    }
}
