package abstract_factory_java;

import abstract_factory_java.factory.PropertyFactory;
import abstract_factory_java.factory.impl.ProgrammerPropertyFactory;
import abstract_factory_java.property.Car;
import abstract_factory_java.property.House;
import abstract_factory_java.property.Money;

/**
 * @author angus
 * @date 2019/11/21
 */
public class MotherInLaw {
    public static void main(String[] args) {
        // 具体工厂可以运行时指定
        PropertyFactory factory = new ProgrammerPropertyFactory();
        Car car = factory.buyCar();
        House house = factory.buyHouse();
        Money money = factory.drawMoney();
        // 打印资产
        System.out.println("car: " + car);
        System.out.println("house: " + house);
        System.out.println("money: " + money);
    }
}
