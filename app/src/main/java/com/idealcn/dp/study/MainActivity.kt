package com.idealcn.dp.study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idealcn.dp.study.R
import com.idealcn.dp.study.builder.Director
import com.idealcn.dp.study.factory.ITab
import com.idealcn.dp.study.factory.tabimpl.MainTab
import com.idealcn.dp.study.factory.IFunction
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //testFactory();
        testBuilder()
    }

    private fun testBuilder() {
        Director().getProduct()
    }
    private fun testFactory() {
        val functionKeyList: List<Int> = ArrayList()
        val mainTab: ITab = MainTab()
        mainTab.functionKeyList = functionKeyList
        mainTab.setFunctionKey(0x11)
        mainTab.setFunctionKey(0x12)
        mainTab.setFunctionKey(0x13)
        mainTab.setFunctionKey(0x14)
        val iFunctionList = mainTab.getFunctionList(functionKeyList)
        //        List<IFunction> functionList = FunctionFactory.getFunction(mainTab);
        for (function in iFunctionList) {
            mainTab.function(function)
        }
    }
}