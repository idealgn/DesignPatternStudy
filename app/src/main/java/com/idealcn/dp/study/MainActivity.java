package com.idealcn.dp.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.idealcn.dp.study.factory.FunctionFactory;
import com.idealcn.dp.study.factory.IFunction;
import com.idealcn.dp.study.factory.ITab;
import com.idealcn.dp.study.factory.tabimpl.MainTab;
import com.idealcn.dp.study.factory.tabimpl.SettingTab;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> functionKeyList = new ArrayList<>();
        ITab mainTab = new MainTab();
        mainTab.setFunctionKeyList(functionKeyList);
        mainTab.setFunctionKey(0x11);
        mainTab.setFunctionKey(0x12);
        mainTab.setFunctionKey(0x13);
        mainTab.setFunctionKey(0x14);
        List<IFunction> functionList = FunctionFactory.getFunction(mainTab);
        for (IFunction function : functionList) {
            mainTab.function(function);
        }
    }
}
