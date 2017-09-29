package com.idealcn.design.study.mvp.m;

import com.idealcn.design.study.mvp.listener.LoginResultCallback;

/**
 * Created by ideal-gn on 2017/9/28.
 */

public class LoginModel {
    public void login(final String username, final String password, final LoginResultCallback callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (!"123".equals(username)){
                    if (callback!=null){
                        callback.error("用户名错误",0);
                    }
                }else if (!"123".equals(password)){
                    if (callback!=null){
                        callback.error("密码错误",0);
                    }
                }else {
                    if (callback!=null){
                        callback.success("登陆成功");
                    }
                }
            }
        }).start();
    }
}
