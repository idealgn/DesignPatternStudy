package com.idealcn.dp.study.factory;

/**
 * Created by ideal on 17-8-5.
 */

public class CommonTools {
    public static boolean hasFunction(int key){
        return key==FunctionCommon.KEY_LAYOUT||
                key==FunctionCommon.KEY_REMOVE||
                key==FunctionCommon.KEY_RESIZE;
    }
}
