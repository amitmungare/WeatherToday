package com.example.weatherapp.data.model

import com.example.weatherapp.data.model.City
import com.example.weatherapp.data.model.NetworkWeatherForecast
import com.google.gson.annotations.SerializedName

data class NetworkWeatherForecastResponse(

    @SerializedName("list")
    val weathers: List<NetworkWeatherForecast>,

    val city: City
)
