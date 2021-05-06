package com.example.weatherapp.mapper

import com.example.weatherapp.data.model.WeatherForecast
import com.example.weatherapp.data.source.local.entity.DBWeatherForecast

class WeatherForecastMapperLocal :
    BaseMapper<List<DBWeatherForecast>, List<WeatherForecast>> {
    override fun transformToDomain(type: List<DBWeatherForecast>): List<WeatherForecast> {
        return type.map { dbWeatherForecast ->
            WeatherForecast(
                dbWeatherForecast.id,
                dbWeatherForecast.date,
                dbWeatherForecast.wind,
                dbWeatherForecast.networkWeatherDescriptions,
                dbWeatherForecast.networkWeatherCondition
            )
        }
    }

    override fun transformToDto(type: List<WeatherForecast>): List<DBWeatherForecast> {
        return type.map { weatherForecast ->
            DBWeatherForecast(
                weatherForecast.uID,
                weatherForecast.date,
                weatherForecast.wind,
                weatherForecast.networkWeatherDescription,
                weatherForecast.networkWeatherCondition
            )
        }
    }
}