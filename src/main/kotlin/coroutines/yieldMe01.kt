package coroutines

import kotlinx.coroutines.*


//coroutine scheduler, yields to other coroutines that may be waiting.
fun mainYield01() = runBlocking {
    val job1 = launch {
        repeat(5) { i ->
            println("Coroutine 1 - iteration ${i +1}")
            yield() // Yield control to other coroutines
        }
    }

    val job2 = launch {
        repeat(5) { i ->
            println("Coroutine 2 - iteration ${i +1}")
            yield() // Yield control to other coroutines
        }
    }

    job1.join() // Wait for job1 to complete
    job2.join() // Wait for job2 to complete
}
