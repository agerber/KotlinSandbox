package edu.uchicago.gerber.code
import kotlinx.coroutines.*


fun main62() = runBlocking {
        println(62)
        println("Main program starts: ${Thread.currentThread().name}")  // edu.uchicago.gerber.code.main thread

        //will inherit the thread of it's parent which is main
        launch {
            println("Background work starts: ${Thread.currentThread().name}")
            delay(1000)
            println("Background work finished: ${Thread.currentThread().name}")
        }

        //this is not the correct way to do this.
        delay(2000)

        println("Main program ends: ${Thread.currentThread().name}")    // edu.uchicago.gerber.code.main thread
}
