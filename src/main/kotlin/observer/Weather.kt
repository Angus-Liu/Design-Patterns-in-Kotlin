package observer

import observer.observer.Child
import observer.observer.Farmer
import kotlin.properties.Delegates
import observer.observer.WeatherObserver


/**
 * @author angus
 * @date 2019/11/24
 */
class Weather {
    private val weatherObserverList = mutableListOf<WeatherObserver>()

    var currentType: WeatherType by Delegates.observable(WeatherType.SUNNY) { _, oldValue, newValue ->
        weatherObserverList.forEach {
            it.weatherChange(oldValue, newValue)
        }
    }

    fun addObserver(observer: WeatherObserver) {
        weatherObserverList.add(observer)
    }

    fun removeObserver(observer: WeatherObserver) {
        weatherObserverList.remove(observer)
    }
}

fun main() {
    val weather = Weather()
    Farmer() subscribe weather
    Child() subscribe weather
    weather.currentType = WeatherType.RAINY
    weather.currentType = WeatherType.COLD
    weather.currentType = WeatherType.WINDY
    weather.currentType = WeatherType.WINDY
    weather.currentType = WeatherType.SUNNY
}