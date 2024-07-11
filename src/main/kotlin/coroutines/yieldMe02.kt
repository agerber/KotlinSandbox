package coroutines

import kotlinx.coroutines.*

fun mainYield02() = runBlocking {
    // Launch a coroutine that performs some repetitive task
    val job1 = launch {
        try {
            repeat(10) { i ->
                println("Coroutine 1 - iteration ${i +1}")
                delay(500L) // Simulate some work
                yield() // Yield control to other coroutines
            }
        } catch (e: CancellationException) {
            println("Coroutine 1 was canceled")
        } finally {
            println("Coroutine 1: Cleaning up")
        }
    }

    // Launch another coroutine
    val job2 = launch {
        repeat(5) { i ->
            println("Coroutine 2 - iteration ${i +1}")
            delay(500L) // Simulate some work
            yield() // Yield control to other coroutines
        }
    }

    // Wait for a while before canceling the first coroutine
    delay(1500L)
    println("Cancelling Coroutine 1")
    job1.cancelAndJoin() // Cancel the first coroutine and wait for its completion
    println("Coroutine 1 has been canceled")

    // Wait for the second coroutine to complete
    job2.join()
    println("Coroutine 2 has completed")
}
