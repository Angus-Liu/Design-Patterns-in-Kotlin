package chain

/**
 * @author angus
 * @date 2019/11/20
 */
class Chain {
    private var chainNodeList: Array<out Chain.(Double) -> Double> = emptyArray()
    private var index = 0

    fun next(num: Double): Double {
        if (index >= chainNodeList.size) return num
        return chainNodeList[index++](num)
    }

    fun start(num: Double): Double {
        index = 0
        return next(num)
    }

    companion object {
        fun build(vararg chainNodeList: Chain.(Double) -> Double): Chain {
            return Chain().apply { this.chainNodeList = chainNodeList }
        }
    }
}

// 交社保：扣除工资的 10%
val paySocialSecurity: Chain.(Double) -> Double = { money ->
    println("> 进入交社保流程：$money")
    next(money * 0.9)
}

// 交个税：金额大于 5000，需要交税，税额 3%
val payTaxes: Chain.(Double) -> Double = { money ->
    println("> 进入个税税流程：$money")
    var m = money
    if (m > 5000) {
        println("x 金额大于 5000，需要交税，税额 3%")
        m -= m * 0.03
    }
    next(m)
}

// 交房租：房租为 500，水电 50
// 当房东看见你工资大于 35000 时会悄悄涨 100 房租，看你工资小于 3000 时，又会免掉你水电费
val payRent: (Chain, Double) -> Double = { chain, money ->
    println("> 进入交房租流程：$money")
    when {
        money > 5000 -> {
            println("x 房东看见你工资大于 3500，悄悄涨了 100 房租")
            chain.next(money - (500 + 100 + 50))
        }
        money < 3000 -> {
            println("x 房东看见你工资小于 3000，免掉了水电费")
            chain.next(money - 500)
        }
        else -> chain.next(money - (500 + 50))
    }
}

// 政府补贴：金额小于2000，接收政府补助 500
val governmentSubsidy = { chain: Chain, money: Double ->
    println("> 进入领补贴流程：$money")
    var m = money
    if (m < 2000) {
        println("x 金额小于 2000，接收政府补助 500")
        m += 500
    }
    chain.next(m)
}

fun main() {
    // 工资数据
    val salaryList = arrayOf(2500.0, 3300.0, 6000.0)

    // 交五险一金、交税、政府补贴、交房租
    var chain = Chain.build(payTaxes, paySocialSecurity, payRent, governmentSubsidy)
    salaryList.forEach {
        println("> 发工资了：$it")
        val res = chain.start(it)
        println("< 工资最终还剩下：$res")
        println("==========================")
    }

    println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    println("领3300工资的人抗议，说补贴应该先发，原因嘛（心机狗，想让第二个人领不到补助）")
    // 处理链的构建动态配置，非常灵活
    chain = Chain.build(payTaxes, paySocialSecurity, governmentSubsidy, payRent)
    salaryList.forEach {
        println("> 发工资了：$it")
        val res = chain.start(it)
        println("< 工资最终还剩下：$res")
        println("==========================")
    }

    val func: String.() -> Unit = { println(this) }
    val str = "Hello World!"
    str.func()
    func(str)
}


