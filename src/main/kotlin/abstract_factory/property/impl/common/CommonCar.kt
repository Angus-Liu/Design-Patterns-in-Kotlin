package abstract_factory.property.impl.common

import abstract_factory.property.Car

class CommonCar : Car {
    override fun toString(): String {
        return "共享汽车"
    }
}