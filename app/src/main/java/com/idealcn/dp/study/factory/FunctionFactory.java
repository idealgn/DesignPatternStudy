package com.idealcn.dp.study.factory;

import com.idealcn.dp.study.factory.functionimpl.DefaultFunction;
import com.idealcn.dp.study.factory.functionimpl.LayoutFunction;
import com.idealcn.dp.study.factory.functionimpl.RemoveFunction;
import com.idealcn.dp.study.factory.functionimpl.ResizeFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ideal on 17-8-5.
 */

public class FunctionFactory {

    public static List<IFunction> getFunction(ITab iTab){
        List<IFunction> iFunctionList = new ArrayList<>();
        List<Integer> functionKeyList = iTab.getFunctionKeyList();
        for (int key : functionKeyList) {
            switch (key){
                case FunctionCommon.KEY_REMOVE:
                    iFunctionList.add(new RemoveFunction());
                    break;
                case FunctionCommon.KEY_RESIZE:
                    iFunctionList.add(new ResizeFunction());
                    break;
                case FunctionCommon.KEY_LAYOUT:
                    iFunctionList.add(new LayoutFunction());
                    break;
                    default:
                        iFunctionList.add(new DefaultFunction());
                        break;
            }
        }
        return iFunctionList;
    }
}
