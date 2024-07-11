package coroutines

import kotlinx.coroutines.*

fun mainWithContext() = runBlocking {
    println("Main program starts: ${Thread.currentThread().name}")

    val result = withContext(Dispatchers.Default) {
        println("Fake computation starts: ${Thread.currentThread().name}")
        // Simulate some CPU-bound work
        heavyComputation()
    }

    println("Computation result: $result")

    withContext(Dispatchers.IO) {
        println("Fake I/O operation starts: ${Thread.currentThread().name}")
        // Simulate some I/O-bound work
        fakeIOOperation()
    }

    println("Main program ends: ${Thread.currentThread().name}")
}

suspend fun heavyComputation(): Int {
    delay(1000) // Simulate computation delay
    return 42
}

suspend fun fakeIOOperation() {
    delay(1000) // Simulate I/O delay
    println("Fake I/O operation completed: ${Thread.currentThread().name}")
}
