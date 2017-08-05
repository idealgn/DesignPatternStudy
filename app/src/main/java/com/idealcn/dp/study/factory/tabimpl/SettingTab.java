package com.idealcn.dp.study.factory.tabimpl;

import com.idealcn.dp.study.factory.IFunction;
import com.idealcn.dp.study.factory.ITab;

import java.util.List;

/**
 * Created by ideal on 17-8-5.
 */

public class SettingTab implements ITab {
    private List<Integer> functionKeyList;
    @Override
    public List<Integer> getFunctionKeyList() {
        return this.functionKeyList;
    }

    @Override
    public void setFunctionKeyList(List<Integer> functionKeyList) {
        this.functionKeyList = functionKeyList;
    }

    @Override
    public void setFunctionKey(int functionKey) {
        functionKeyList.add(functionKey);
    }

    @Override
    public void function(IFunction function) {
        function.function();
    }
}
