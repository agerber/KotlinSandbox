package edu.uchicago.gerber.code
import kotlinx.coroutines.*


fun main64() = runBlocking {    // Creates a blocking coroutine that executes in current thread (edu.uchicago.gerber
    // .code.main)

    println("Main program starts: ${Thread.currentThread().name}")  // edu.uchicago.gerber.code.main thread

    val job: Job = launch {   // Thread: edu.uchicago.gerber.code.main
        println("Fake work starts: ${Thread.currentThread().name}")     // Thread: edu.uchicago.gerber.code.main
        delay(1000)   // Coroutine is suspended but Thread: edu.uchicago.gerber.code.main is free (not blocked)
        println("Fake work finished: ${Thread.currentThread().name}") // Thread: edu.uchicago.gerber.code.main
    }

    job.join()      // edu.uchicago.gerber.code.main thread: wait for coroutine to finish

    println("Main program ends: ${Thread.currentThread().name}")    // edu.uchicago.gerber.code.main thread
}
