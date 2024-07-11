package coroutines

import kotlinx.coroutines.*


fun scen03c() = runBlocking {
    println(fetchData())

}

//if your method is long-running, you must advertise to the caller by using the suspend keyword
suspend fun fetchData(): String {

    val data = withContext(Dispatchers.IO) {
        println("fetchDataFromServer-start(A)")
        delay(2000)
        println("fetchDataFromServer-finish(Af)")
        "data from server"
    }

    println("showDataToUser(B)")
    return data
}


