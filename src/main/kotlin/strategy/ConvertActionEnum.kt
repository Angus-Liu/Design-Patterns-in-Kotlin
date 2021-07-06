package strategy

/**
 * @author angus
 * @date 2019/11/24
 */
enum class ConvertActionEnum(val convertAction: (Double) -> Double) {
    // 美元换算成人民币
    DOLLAR_TO_RMB({ money -> money * 7.0 }),
    // 欧元换算成人民币
    EURO_TO_RMB({ money -> money * 7.7}),
    // 日元换算成人民币
    YEN_TO_RMB({ money -> money / 15.4})
    ;
}