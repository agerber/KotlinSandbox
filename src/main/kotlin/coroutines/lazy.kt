package coroutines

import kotlinx.coroutines.*

fun mainLazy() = runBlocking {
    println("Main program starts: ${Thread.currentThread().name}")

    //this job is now lazy, which means it won't execute automatically.
    val job = launch(start = CoroutineStart.LAZY) {
        println("Coroutine starts: ${Thread.currentThread().name}")
        delay(1000L)
        println("Coroutine ends: ${Thread.currentThread().name}")
    }

    delay(500L)

    //try un-commenting out these three lines and make launch non-lazy /lazy
    //println("Starting coroutine now")
    //job.start() // Manually start the coroutine
    //job.join()  // Wait for the coroutine to complete

    println("Main program ends: ${Thread.currentThread().name}")
}
