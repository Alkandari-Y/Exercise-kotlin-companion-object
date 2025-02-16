fun main() {
    val degreeInFa = TemperatureConverter.toFahrenheit(36.00)
    val degreeInC = TemperatureConverter.toCelsius(50.00)
    val roomTempInKelvin = TemperatureConverter.celsiusToKelvin(25.toDouble())
    val bodyTempInKelvin = TemperatureConverter.fahrenheitToKelvin(98.6)
    val absoluteZeroInKelvin = TemperatureConverter.kelvinToCelsius(0.00)
    val kelvinToFahrenheit = TemperatureConverter.kelvinToFahrenheit(2341.00)

    println("${degreeInFa}F")
    println("${degreeInC}C")
    println("${roomTempInKelvin}k")
    println("${bodyTempInKelvin}k")
    println("${absoluteZeroInKelvin}C")
    println("${kelvinToFahrenheit}F")
}

class TemperatureConverter {
    companion object {
        val toCelsius = { degreeInFahrenheit: Double ->  (degreeInFahrenheit - 32) * 5 / 9 }
        val  toFahrenheit = { degreeInCelsius: Double -> (degreeInCelsius * 9 / 5) + 32 }
        val celsiusToKelvin = { degreeInCelsius: Double -> degreeInCelsius + 273.15 }
        val fahrenheitToKelvin = { degreeInFahrenheit: Double -> toCelsius(degreeInFahrenheit) + 273.15 }
        val  kelvinToCelsius = { degreeInKelvin: Double -> degreeInKelvin - 273.15 }
        val kelvinToFahrenheit = { degreeInKelvin: Double -> (degreeInKelvin - 273.15) * 9/5 + 32 }
    }
}
