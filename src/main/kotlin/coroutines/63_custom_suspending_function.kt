package edu.uchicago.gerber.code
import kotlinx.coroutines.*


fun main63() = runBlocking {        // Executes in edu.uchicago.gerber.code.main thread

        println("Main program starts: ${Thread.currentThread().name}")  // edu.uchicago.gerber.code.main thread

        GlobalScope.launch {    // Thread: T1
            println("Fake work starts: ${Thread.currentThread().name}")     // Thread: T1
            mySuspendFunc(1000)   // Coroutine is suspended but Thread: T1 is free (not blocked)
            println("Fake work finished: ${Thread.currentThread().name}") // Either T1 or some other thread.
        }

        mySuspendFunc(2000)  // edu.uchicago.gerber.code.main thread: wait for coroutine to finish (practically not a right way to wait)

        println("Main program ends: ${Thread.currentThread().name}")    // edu.uchicago.gerber.code.main thread
}

suspend fun mySuspendFunc(time: Long) {
    // code..
    delay(time)
}
