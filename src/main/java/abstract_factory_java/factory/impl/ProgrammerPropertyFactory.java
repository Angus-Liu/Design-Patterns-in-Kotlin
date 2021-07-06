package abstract_factory_java.factory.impl;

import abstract_factory_java.factory.PropertyFactory;
import abstract_factory_java.property.Car;
import abstract_factory_java.property.House;
import abstract_factory_java.property.Money;
import abstract_factory_java.property.impl.programmer.ProgrammerCar;
import abstract_factory_java.property.impl.programmer.ProgrammerHouse;
import abstract_factory_java.property.impl.programmer.ProgrammerMoney;

/**
 * @author angus
 * @date 2019/11/21
 */
public class ProgrammerPropertyFactory implements PropertyFactory {
    @Override
    public Car buyCar() {
        return new ProgrammerCar();
    }

    @Override
    public House buyHouse() {
        return new ProgrammerHouse();
    }

    @Override
    public Money drawMoney() {
        return new ProgrammerMoney();
    }
}
