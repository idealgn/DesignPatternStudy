package com.idealcn.dp.study.builder

abstract class Car(val name : String): Product {
    abstract fun start()
    abstract fun run()
    abstract fun stop()
}