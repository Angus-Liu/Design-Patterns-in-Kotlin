package abstract_factory_java.property.impl.common;

import abstract_factory_java.property.Car;

/**
 * @author angus
 * @date 2019/11/21
 */
public class CommonCar implements Car {
    @Override
    public String toString() {
        return "共享汽车";
    }
}
