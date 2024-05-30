package coroutine
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

// Synchronous code
// fun main() {
//    val time = measureTimeMillis {
//        runBlocking {
//            println("Weather forecast")
//            printForecast()
//            printTemperature()
//        }
//    }
//    println("Execution time: ${time / 1000.0} seconds")
//}
//
//suspend fun printForecast() {
//    delay(1000)
//    println("Sunny")
//}
//
//suspend fun printTemperature() {
//    delay(1000)
//    println("30\u00b0C")
//}

// Asynchronous code with launch
//fun main() {
//    val time = measureTimeMillis {
//        println("Weather forecast")
//        runBlocking {
//            launch {
//                printForecast()
//            }
//            launch {
//                printTemperature()
//            }
//            println("Have a good day!")
//        }
//    }
//    println("Execution time: ${time / 1000.0} seconds")
//}
//
//suspend fun printForecast() {
//    delay(1000)
//    println("Sunny")
//}
//
//suspend fun printTemperature() {
//    delay(1000)
//    println("30\u00b0C")
//}

// Asynchronous code - Async & Await
fun main() {
    val time = measureTimeMillis {
        println("Weather forecast")
        runBlocking {
//            val forecast: Deferred<String> = async {
//                getForecast()
//            }
//            val temerature: Deferred<String> = async {
//                getTemperature()
//            }
            try {
                println(getWeatherReport())
            } catch(e: AssertionError) {
             println("Caught exception in runBlocking(): $e")
             println("Report unavailable at this time")
            }
//            println("${forecast.await()} ${temerature.await()}")
            println("Have a good day!")
        }
    }
    println("Execution time: ${time / 1000.0} seconds")
}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(1000)
    throw AssertionError("Temperature is invalid")
    return "30\u00b0C"
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast()}
    val temperature = async {
        try {
            getTemperature()
        } catch(e: AssertionError) {
            println("Caught exception $e")
            "{No temprature found}"
            }
        }
    // temprature.cancel()
    "${forecast.await()} ${temperature.await()}"
}