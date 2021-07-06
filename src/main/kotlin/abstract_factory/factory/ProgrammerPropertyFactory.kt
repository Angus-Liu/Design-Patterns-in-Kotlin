package abstract_factory.factory.impl

import abstract_factory.factory.PropertyFactory
import abstract_factory.property.Car
import abstract_factory.property.House
import abstract_factory.property.Money
import abstract_factory.property.impl.programmer.ProgrammerCar
import abstract_factory.property.impl.programmer.ProgrammerHouse
import abstract_factory.property.impl.programmer.ProgrammerMoney

class ProgrammerPropertyFactory : PropertyFactory {
    override fun buyCar(): Car = ProgrammerCar()

    override fun buyHouse(): House = ProgrammerHouse()

    override fun drawMoney(): Money = ProgrammerMoney()
}