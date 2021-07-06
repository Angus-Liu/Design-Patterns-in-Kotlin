package builder.b

/**
 * @author angus
 * @date 2019/11/21
 */
data class Person(
    var name: String? = null,
    var age: Int? = null,
    var contact: Contact? = null,
    var addr: Address? = null
) {
    constructor(init: Person.() -> Unit) : this() {
        init()
    }
}

data class Contact(
    var phone: String? = null,
    var qq: String? = null,
    var wechat: String? = null
) {
    constructor(init: Contact.() -> Unit) : this() {
        init()
    }
}

data class Address(
    var province: String? = null,
    var city: String? = null,
    var street: String? = null
) {
    constructor(init: Address.() -> Unit) : this() {
        init()
    }
}

fun main() {
    var p = Person {
        name = "Angus"
        age = 23
        contact = Contact {
            phone = "18328635851"
            qq = "1713862733"
            wechat = "Lu"
        }
        addr = Address {
            province = "四川"
            city = "成都"
            street = "鹤山街道"
        }
    }
    println(p)

    p = Person {
        // 函数比赋值语句功能强大的多
        name = "Angus"
        age = 23
        contact = Contact {
            // 这里面可以很方便的实现复杂的逻辑
            phone = "18328635851"
            if (age != null) {
                if (age!! < 18) qq = "1713862733" else wechat = "Lu"
            }
        }
        addr = Address {
            province = "四川"
            city = "成都"
            street = "鹤山街道"
        }
    }
    println(p)
}