package other

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


fun main74() = runBlocking {    // Creates a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val time = measureTimeMillis {
        val msgOne = getMessageOneA()
        val msgTwo = getMessageTwoA()
        println("The entire message is: ${msgOne + msgTwo}")
    }

    println("Completed in $time ms")
    println("Main program ends: ${Thread.currentThread().name}")    // main thread
}

suspend fun getMessageOneA(): String {
    delay(1000L)    // pretend to do some work
    return "Hello "
}

suspend fun getMessageTwoA(): String {
    delay(1000L)    // pretend to do some work
    return "World!"
}
