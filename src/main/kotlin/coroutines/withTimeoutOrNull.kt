package coroutines

import kotlinx.coroutines.*

fun withTimeoutOrNull() = runBlocking {
    println("Main program starts: ${Thread.currentThread().name}")

    val result = withTimeoutOrNull(2000L) { // 2-second timeout
        repeat(5) { i ->
            println("Working on task $i")
            delay(500L) // Simulate some work
        }
        "Completed Successfully" // This is the result if it completes in time
    }

    println("The value of result is $result")
    println("Main program ends: ${Thread.currentThread().name}")
}
