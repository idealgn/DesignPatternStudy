package com.idealcn.dp.study.builder

import com.idealcn.dp.study.builder.Product
import com.idealcn.dp.study.builder.car.BMW

abstract class Builder<T : Product> {
    //设置产品的不同部分，以获得不同的产品
    abstract fun setPart()

    //建造产品
    abstract fun buildProduct(): T
}

/**
 * 具体的建造者
 * 如果有多个产品类就有多个具体的建造者
 */
abstract class CarBuilder<T : Car> : Builder<T>() {

}

class BMWBuilder : CarBuilder<BMW>(){
    private val car = BMW()
    override fun setPart() {

    }

    override fun buildProduct(): BMW {
        println("生产了一辆BMW")
        return car
    }

}