package abstract_factory.factory

import abstract_factory.factory.impl.CommonPropertyFactory
import abstract_factory.factory.impl.ProgrammerPropertyFactory
import abstract_factory.property.Car
import abstract_factory.property.House
import abstract_factory.property.Money

/**
 * @author angus
 * @date 2019/11/21
 */
interface PropertyFactory {
    fun buyCar(): Car
    fun buyHouse(): House
    fun drawMoney(): Money

    companion object {
        // 范型实化
        inline fun <reified T : PropertyFactory> instance(): PropertyFactory =
            when (T::class) {
                CommonPropertyFactory::class -> CommonPropertyFactory()
                ProgrammerPropertyFactory::class -> ProgrammerPropertyFactory()
                else -> throw IllegalArgumentException()
            }
    }
}