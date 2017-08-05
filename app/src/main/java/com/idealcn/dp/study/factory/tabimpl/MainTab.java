package com.idealcn.dp.study.factory.tabimpl;

import com.idealcn.dp.study.factory.CommonTools;
import com.idealcn.dp.study.factory.IFunction;
import com.idealcn.dp.study.factory.ITab;

import java.util.List;

/**
 * Created by ideal on 17-8-5.
 */

public class MainTab implements ITab {

    private int functionKey;
    private List<Integer> functionKeyList;

    public int getFunctionKey() {
        return functionKey;
    }

    @Override
    public void setFunctionKey(int functionKey) {
//        if (CommonTools.hasFunction(functionKey))
        this.functionKey = functionKey;
        functionKeyList.add(functionKey);
    }

    @Override
    public void function(IFunction function) {
        function.function();
    }

    public void setFunctionKeyList(List<Integer> functionKeyList) {
        this.functionKeyList = functionKeyList;
    }

    public void toMain(){
        System.out.println("回到主界面");
    }

    @Override
    public List<Integer> getFunctionKeyList() {
        return this.functionKeyList;
    }
}
