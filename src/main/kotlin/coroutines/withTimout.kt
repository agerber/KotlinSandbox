import kotlinx.coroutines.*

fun mainWithTimeout() = runBlocking {
    try {
        withTimeout(1000) {
            repeat(5) { i ->
                println("Iteration: I'm sleeping ${i + 1} ...")
                delay(500L)
            }
        }
    } catch (e: TimeoutCancellationException) {
        println("Job: Timed out!")
    }
}
