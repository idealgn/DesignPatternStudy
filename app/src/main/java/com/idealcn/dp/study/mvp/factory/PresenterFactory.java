package com.idealcn.design.study.mvp.factory;

import com.idealcn.design.study.mvp.base.IBasePresenter;

/**
 * Created by ideal-gn on 2017/9/28.
 */

public interface PresenterFactory<P extends IBasePresenter> {

    P create();

}
