package com.idealcn.dp.study.factory.functionimpl;

import com.idealcn.dp.study.factory.IFunction;

/**
 * Created by ideal on 17-8-5.
 */

public class RemoveFunction implements IFunction {
    @Override
    public void function() {
        System.out.println("移除图标");
    }
}
