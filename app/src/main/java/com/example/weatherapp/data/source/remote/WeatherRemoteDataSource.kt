package com.example.weatherapp.data.source.remote

import com.example.weatherapp.data.model.LocationModel
import com.example.weatherapp.data.model.NetworkWeather
import com.example.weatherapp.data.model.NetworkWeatherForecast
import com.example.weatherapp.utils.Result

interface WeatherRemoteDataSource {
    suspend fun getWeather(location: LocationModel): Result<NetworkWeather>

    suspend fun getWeatherForecast(cityId: Int): Result<List<NetworkWeatherForecast>>

    suspend fun getSearchWeather(query: String): Result<NetworkWeather>
}