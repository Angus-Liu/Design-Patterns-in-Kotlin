package observer.observer

import observer.Weather
import observer.WeatherType

/**
 * @author angus
 * @date 2019/11/24
 */
interface WeatherObserver {
    fun weatherChange(oldWeatherType: WeatherType, newWeather: WeatherType)

    infix fun subscribe(weather: Weather) {
        weather.addObserver(this)
    }

    infix fun unsubscribe(weather: Weather) {
        weather.removeObserver(this)
    }
}