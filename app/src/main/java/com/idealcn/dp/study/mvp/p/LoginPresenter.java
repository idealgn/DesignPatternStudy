package com.idealcn.design.study.mvp.p;

import com.idealcn.design.study.mvp.base.IBasePresenter;
import com.idealcn.design.study.mvp.listener.LoginResultCallback;
import com.idealcn.design.study.mvp.m.LoginModel;
import com.idealcn.design.study.mvp.v.LoginView;

/**
 * author: ideal-gn
 * date: 2017/9/28.
 */

public class LoginPresenter extends IBasePresenter<LoginView>{
    private LoginModel loginModel;

    public LoginPresenter(){
        loginModel = new LoginModel();
    }



    public void login(String username, String password) {
        final LoginView loginView = getView();
        if (loginView==null)return;
        loginView.showLoginProgress();
        loginModel.login(username,password,new LoginResultCallback(){
            @Override
            public void success(String result) {
                loginView.loginSuccess();
            }
            @Override
            public void error(String error, int errorCode) {
                loginView.loginError(error,errorCode);
            }
        });
    }
}
