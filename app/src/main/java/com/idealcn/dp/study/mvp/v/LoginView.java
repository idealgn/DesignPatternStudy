package com.idealcn.design.study.mvp.v;

import com.idealcn.design.study.mvp.base.IBaseView;

/**
 * author: ideal-gn
 * date: 2017/9/28.
 */

public interface LoginView extends IBaseView{
    void showLoginProgress();
    void loginError(String error, int errorCode);
    void loginSuccess();
}
