package com.example.weatherapp.mapper

import com.example.weatherapp.data.model.NetworkWeather
import com.example.weatherapp.data.model.Weather

class WeatherMapperRemote : BaseMapper<NetworkWeather, Weather> {
    override fun transformToDomain(type: NetworkWeather): Weather = Weather(
        uId = type.uId,
        cityId = type.cityId,
        name = type.name,
        wind = type.wind,
        networkWeatherDescription = type.networkWeatherDescriptions,
        networkWeatherCondition = type.networkWeatherCondition
    )

    override fun transformToDto(type: Weather): NetworkWeather = NetworkWeather(
        uId = type.uId,
        cityId = type.cityId,
        name = type.name,
        wind = type.wind,
        networkWeatherDescriptions = type.networkWeatherDescription,
        networkWeatherCondition = type.networkWeatherCondition
    )
}