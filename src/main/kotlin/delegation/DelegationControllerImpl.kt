package delegation

/**
 * @author angus
 * @date 2019/11/24
 */
class DelegationControllerImpl(private val c: Controller) : Controller by c {
    override fun request(vararg args: Int) {
        c.request(*args)
        println("委托方法 -> 打印请求参数：${args.contentToString()}")
    }

    override fun response(): Int {
        val response = c.response()
        println("委托方法 -> 打印响应值：$response")
        return response
    }
}

fun main() {
    // 委托更像装饰者模式，但同样可以作为代理模式
    val c = ControllerImpl()
    val dc = DelegationControllerImpl(c)
    dc.request(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    dc.doAction()
    dc.response()
}