package abstract_factory

import abstract_factory.factory.PropertyFactory
import abstract_factory.factory.impl.CommonPropertyFactory
import abstract_factory.factory.impl.ProgrammerPropertyFactory

/**
 * @author angus
 * @date 2019/11/21
 */
class MotherInLaw

fun main() {
    var factory: PropertyFactory = CommonPropertyFactory()
    var car = factory.buyCar()
    var house = factory.buyHouse()
    var money = factory.drawMoney()
    println("car: $car, house: $house, money: $money")

    // 也可以传递一个枚举类型参数
    factory = PropertyFactory.instance<ProgrammerPropertyFactory>()
    car = factory.buyCar()
    house = factory.buyHouse()
    money = factory.drawMoney()
    println("car: $car, house: $house, money: $money")
}