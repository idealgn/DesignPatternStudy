package com.idealcn.dp.study.factory.functionimpl;

import com.idealcn.dp.study.factory.IFunction;

/**
 * Created by ideal on 17-8-5.
 * 未定义的功能
 */

public class DefaultFunction implements IFunction {
    @Override
    public void function() {
        System.out.println("该功能尚未定义");
    }
}
