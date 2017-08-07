package com.idealcn.dp.study.factory;

import java.util.List;

/**
 * Created by ideal on 17-8-5.
 */

public interface ITab {

    List<Integer> getFunctionKeyList();
    void setFunctionKeyList(List<Integer> functionKeyList);
    void setFunctionKey(int functionKey);
    void function(IFunction function);

    List<IFunction> getFunctionList(List<Integer> functionKeyList);
}
