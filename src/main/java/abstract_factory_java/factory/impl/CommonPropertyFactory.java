package abstract_factory_java.factory.impl;

import abstract_factory_java.factory.PropertyFactory;
import abstract_factory_java.property.Car;
import abstract_factory_java.property.House;
import abstract_factory_java.property.Money;
import abstract_factory_java.property.impl.common.CommonCar;
import abstract_factory_java.property.impl.common.CommonHouse;
import abstract_factory_java.property.impl.common.CommonMoney;

/**
 * @author angus
 * @date 2019/11/21
 */
public class CommonPropertyFactory implements PropertyFactory {
    @Override
    public Car buyCar() {
        return new CommonCar();
    }

    @Override
    public House buyHouse() {
        return new CommonHouse();
    }

    @Override
    public Money drawMoney() {
        return new CommonMoney();
    }
}
