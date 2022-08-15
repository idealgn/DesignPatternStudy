package com.idealcn.dp.study.builder

class Director {

    private val builder = BMWBuilder()

    fun getProduct() : Product {
        builder.setPart()
        return builder.buildProduct()
    }

}