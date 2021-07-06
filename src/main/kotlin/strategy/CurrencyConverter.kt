package strategy

/**
 * @author angus
 * @date 2019/11/24
 */
class CurrencyConverter {
    fun convert(money: Double, convertAction: (Double) -> Double): Double = convertAction(money)
}

fun main() {
    val money = 100.0
    val converter = CurrencyConverter()
    with(converter) {
        println(convert(money, ConvertActionEnum.DOLLAR_TO_RMB.convertAction))
        println(convert(money, ConvertActionEnum.EURO_TO_RMB.convertAction))
        println(convert(money, ConvertActionEnum.YEN_TO_RMB.convertAction))
        println(convert(money) { it * 100 })
    }
}