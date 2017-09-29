package com.idealcn.design.study.mvp.listener;

/**
 * Created by ideal-gn on 2017/9/28.
 */

public interface LoginResultCallback {
    void success(String result);
    void error(String error,int errorCode);
}
