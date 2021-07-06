package observer.observer

import observer.WeatherType

class Farmer : WeatherObserver {
    override fun weatherChange(oldWeatherType: WeatherType, newWeather: WeatherType) {
        print("# 农夫：")
        if (oldWeatherType == newWeather) println("天气没变，继续手中的活")
        else
            when (newWeather) {
                WeatherType.SUNNY -> println("日子真好，趁太阳没下山，去地里好好工作")
                WeatherType.WINDY -> println("哎呦，刮风了，真凉快啊，休息一会")
                WeatherType.COLD -> println("好冷啊，还是呆在家里吧")
                WeatherType.RAINY -> println("下雨了，快把衣服收了")
            }

    }
}