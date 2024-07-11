package coroutines

import kotlinx.coroutines.*

fun mainContexts() = runBlocking {
    println("program starts: ${Thread.currentThread().name}")

    //Main dispatcher is used for Android and JavaFX. It requires additional
    //dependencies


    // Default dispatcher
    val defaultJob = launch(Dispatchers.Default) {
        println("Default Dispatcher: ${Thread.currentThread().name}")
        delay(500L)
        println("Default Dispatcher after delay: ${Thread.currentThread().name}")
    }

    // Unconfined dispatcher
    val unconfinedJob = launch(Dispatchers.Unconfined) {
        println("Unconfined Dispatcher: ${Thread.currentThread().name}")
        delay(500L)
        println("Unconfined Dispatcher after delay: ${Thread.currentThread().name}")
    }

    // IO dispatcher
    val ioJob = launch(Dispatchers.IO) {
        println("IO Dispatcher: ${Thread.currentThread().name}")
        delay(500L)
        println("IO Dispatcher after delay: ${Thread.currentThread().name}")
    }

    // Join jobs to ensure they complete
    defaultJob.join()
    unconfinedJob.join()
    ioJob.join()

    println("Main program ends: ${Thread.currentThread().name}")
}
