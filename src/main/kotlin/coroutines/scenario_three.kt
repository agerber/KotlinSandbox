package coroutines

import kotlinx.coroutines.*

fun scen03() = runBlocking {
    println("scen03")

    val job: Job =  launch(Dispatchers.IO) {
        println("fetchDataFromServer-start(A)")
        delay(2000)
        println("fetchDataFromServer-finish(Af)")
    }

    //run on a background thread and alert the parent (main-ui) thread when done.
    job.join()

    println("showDataToUser(B)")




}
