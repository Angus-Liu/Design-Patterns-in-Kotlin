package builder.a

/**
 * @author angus
 * @date 2019/11/21
 */
data class Person(
    var name: String? = null,
    var age: Int? = null,
    var contact: Contact? = null,
    var addr: Address? = null
)

data class Contact(
    var phone: String? = null,
    var qq: String? = null,
    var wechat: String? = null
)

data class Address(
    var province: String? = null,
    var city: String? = null,
    var street: String? = null
)

class Builder(init: Builder.() -> Unit) {
    var name: String? = null
    var age: Int? = null
    var contact: Contact? = null
    var addr: Address? = null

    init {
        init()
    }

    fun contact(init: Contact.() -> Unit) {
        contact = Contact().apply(init)
    }

    fun addr(init: Address.() -> Unit) {
        addr = Address().apply(init)
    }

    fun build(): Person = Person(name, age, contact, addr)
}

fun person(init: Builder.() -> Unit) = Builder(init).build()

fun main() {
    // kotlin 不需要 builder 模式？
    var p = Person(
        name = "Angus",
        age = 23,
        contact = Contact("18328635851", "1713862733", "Lu"),
        addr = Address("四川", "成都", "鹤山")
    )
    println(p)

    p = Person(name = "Angus", age = 23).apply {
        // 可以进行逻辑运算
        contact = Contact("18328635851", "1713862733", "Lu")
        addr = Address("四川").apply {
            city = "成都"
            street = "鹤山街道"
        }
    }
    println(p)

    // DSL Builder，DSL  像是下一代的建造者模式
    p = person {
        name = "Angus"
        age = 23
        contact {
            phone = "18328635851"
            qq = "1713862733"
            wechat = "Lu"
        }
        addr {
            province = "四川"
            city = "成都"
            street = "鹤山街道"
        }
    }
    println(p)
}