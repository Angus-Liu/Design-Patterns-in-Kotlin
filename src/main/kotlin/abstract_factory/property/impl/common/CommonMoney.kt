package abstract_factory.property.impl.common

import abstract_factory.property.Money

class CommonMoney : Money {
    override fun toString(): String {
        return "月薪4000"
    }
}