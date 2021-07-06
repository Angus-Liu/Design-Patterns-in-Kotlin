package delegation

/**
 * @author angus
 * @date 2019/11/24
 */
interface Controller {
    fun request(vararg args: Int)
    fun doAction()
    fun response(): Int
}