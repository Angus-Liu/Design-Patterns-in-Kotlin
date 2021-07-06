package abstract_factory.factory.impl

import abstract_factory.factory.PropertyFactory
import abstract_factory.property.Car
import abstract_factory.property.House
import abstract_factory.property.Money
import abstract_factory.property.impl.common.CommonCar
import abstract_factory.property.impl.common.CommonHouse
import abstract_factory.property.impl.common.CommonMoney

class CommonPropertyFactory : PropertyFactory {
    override fun buyCar(): Car = CommonCar()

    override fun buyHouse(): House = CommonHouse()

    override fun drawMoney(): Money = CommonMoney()
}