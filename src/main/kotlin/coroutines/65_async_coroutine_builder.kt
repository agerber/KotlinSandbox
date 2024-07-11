package edu.uchicago.gerber.code
import kotlinx.coroutines.*


fun main65() = runBlocking {    // Creates a blocking coroutine that executes in current thread (edu.uchicago.gerber
    // .code.main)

    println(65)
    println("Main program starts: ${Thread.currentThread().name}")  // edu.uchicago.gerber.code.main thread

    val stringDeferred: Deferred<String> = async  { // Thread: edu.uchicago.gerber.code.main
        println("Fake work starts: ${Thread.currentThread().name}")     // Thread: edu.uchicago.gerber.code.main
        delay(1000)   // Coroutine is suspended but Thread: edu.uchicago.gerber.code.main is free (not blocked)
        println("Fake work finished: ${Thread.currentThread().name}") // Thread: edu.uchicago.gerber.code.main
        return@async "Adam"
    }

    val teacher: String = stringDeferred.await()  // edu.uchicago.gerber.code.main thread: wait for coroutine to finish
    println(teacher)

    println("Main program ends: ${Thread.currentThread().name}")    // edu.uchicago.gerber.code.main thread
}
