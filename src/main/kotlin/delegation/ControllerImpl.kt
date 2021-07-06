package delegation

/**
 * @author angus
 * @date 2019/11/24
 */
class ControllerImpl: Controller {

    private var args : IntArray = IntArray(0)
    private var sum: Int = 0

    override fun request(vararg args: Int) {
        println("--------")
        println("接收请求")
        this.args = args
    }

    override fun doAction() {
        println("--------")
        println("进行处理")
        sum = args.sum()
    }

    override fun response(): Int {
        println("--------")
        println("返回响应")
        return sum
    }
}