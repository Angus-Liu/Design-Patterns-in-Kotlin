package abstract_factory_java.factory;

import abstract_factory_java.property.Car;
import abstract_factory_java.property.House;
import abstract_factory_java.property.Money;

public interface PropertyFactory {
    Car buyCar();
    House buyHouse();
    Money drawMoney();
}
