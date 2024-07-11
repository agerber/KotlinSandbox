package other

import kotlinx.coroutines.*


fun main66() = runBlocking {    // Creates a blocking coroutine that executes in current thread (edu.uchicago.gerber
    // .code.main)

    println("Main program starts: ${Thread.currentThread().name}")  // edu.uchicago.gerber.code.main thread

    val deferredJob: Deferred<Int> = async {  // Thread: edu.uchicago.gerber.code.main
        println("Fake work starts: ${Thread.currentThread().name}")     // Thread: edu.uchicago.gerber.code.main
        delay(1000)   // Coroutine is suspended but Thread: edu.uchicago.gerber.code.main is free (not blocked)
        println("Fake work finished: ${Thread.currentThread().name}") // Thread: edu.uchicago.gerber.code.main
        15
    }

    val num: Int = deferredJob.await()  // edu.uchicago.gerber.code.main thread: wait for coroutine to finish and return data

    println("Main program ends: ${Thread.currentThread().name}")    // edu.uchicago.gerber.code.main thread
}

suspend fun myOwnSuspendingFunc() {
    delay(1000)     // do something
}
