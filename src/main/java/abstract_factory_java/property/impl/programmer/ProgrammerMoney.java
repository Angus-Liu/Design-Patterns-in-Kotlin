package abstract_factory_java.property.impl.programmer;

import abstract_factory_java.property.Money;

/**
 * @author angus
 * @date 2019/11/21
 */
public class ProgrammerMoney implements Money {
    @Override
    public String toString() {
        return "存款超过6位数吧";
    }
}
