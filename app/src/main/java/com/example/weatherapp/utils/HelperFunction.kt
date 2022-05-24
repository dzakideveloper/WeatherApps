package com.example.weatherapp.utils

import java.math.RoundingMode

object HelperFunction {
    fun formatDegree(temperature: Double?): String {
        val temp = temperature as Double
        val tempToCelsius = temp - 273.0
        val formatDegree = tempToCelsius.toBigDecimal().setScale(2, RoundingMode.CEILING).toDouble()
        return "$formatDegree°C"
    }
}