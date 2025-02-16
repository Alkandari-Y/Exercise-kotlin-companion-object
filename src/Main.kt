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
        fun toCelsius(degreeInFahrenheit: Double): Double {
            return (degreeInFahrenheit -32) * 5 / 9
        }

        fun toFahrenheit(degreeInCelsius: Double): Double {
            return (degreeInCelsius * 9/5) + 32
        }

        fun celsiusToKelvin(degreeInCelsius: Double): Double{
            return degreeInCelsius + 273.15
        }

        fun fahrenheitToKelvin(degreeInFahrenheit: Double): Double {
            return toCelsius(degreeInFahrenheit)+ 273.15
        }

        fun kelvinToCelsius(degreeInKelvin: Double): Double {
            return degreeInKelvin - 273.15
        }

        fun kelvinToFahrenheit(degreeInKelvin: Double): Double {
            return (degreeInKelvin - 273.15) * 9/5 + 32;
        }

    }
}
