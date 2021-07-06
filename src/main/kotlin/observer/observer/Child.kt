package observer.observer

import observer.WeatherType

class Child : WeatherObserver {
    override fun weatherChange(oldWeatherType: WeatherType, newWeather: WeatherType) {
        print("@ 孩子：")
        if (oldWeatherType == newWeather) println("天气没有变嘛")
        else
            when (newWeather) {
                WeatherType.SUNNY -> println("出太阳啦，我们去爬山吧")
                WeatherType.WINDY -> println("起风了，我们去放风筝吧")
                WeatherType.COLD -> println("好冷啊，我们去烤火吧")
                WeatherType.RAINY -> println("下雨了，我们快回家吧")
            }
    }
}