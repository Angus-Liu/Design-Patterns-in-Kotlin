package abstract_factory.property.impl.programmer

import abstract_factory.property.Money

class ProgrammerMoney : Money {
    override fun toString(): String {
        return "存款超过6位数吧"
    }
}