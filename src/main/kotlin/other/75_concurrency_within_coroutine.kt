package other

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


fun main75() = runBlocking {    // Creates a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val time = measureTimeMillis {
        val msgOne: Deferred<String> = async {
            // ..more code..
            getMessageOneB()
        }
        val msgTwo: Deferred<String> = async {
            // ..more code..
            getMessageTwoB()
        }
        println("The entire message is: ${msgOne.await() + msgTwo.await()}")
    }

    println("Completed in $time ms")
    println("Main program ends: ${Thread.currentThread().name}")    // main thread
}

suspend fun getMessageOneB(): String {
    delay(1000L)    // pretend to do some work
    return "Hello "
}

suspend fun getMessageTwoB(): String {
    delay(1000L)    // pretend to do some work
    return "World!"
}
