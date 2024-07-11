package edu.uchicago.gerber.code
import kotlinx.coroutines.*

fun main68() = runBlocking {    // Creates a blocking coroutine that executes in current thread (edu.uchicago.gerber
    // .code.main)
    println(68)
    println("Main program starts: ${Thread.currentThread().name}")  // edu.uchicago.gerber.code.main thread

    val job: Job = launch {     // Thread edu.uchicago.gerber.code.main: Creates a non-blocking coroutine
        for (i in 0..500) {
            print("$i.")
            yield()     // yeild means check to see if we've been cancelled.
        }
    }

    delay(5)  // Let's print a few values before we cancel
    job.cancelAndJoin()

    println("\nMain program ends: ${Thread.currentThread().name}")    // edu.uchicago.gerber.code.main thread
}
