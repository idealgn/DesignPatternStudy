package com.idealcn.dp.study.factory.tabimpl;

import com.idealcn.dp.study.factory.CommonTools;
import com.idealcn.dp.study.factory.FunctionFactory;
import com.idealcn.dp.study.factory.IFunction;
import com.idealcn.dp.study.factory.ITab;

import java.util.ArrayList;
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

    @Override
    public List<IFunction> getFunctionList(List<Integer> functionKeyList) {
        List<IFunction> functionList = new ArrayList<>();
        IFunction function;
        for (int key : functionKeyList) {
            function = FunctionFactory.getFunction(key);
            functionList.add(function);
        }
        return functionList;
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
