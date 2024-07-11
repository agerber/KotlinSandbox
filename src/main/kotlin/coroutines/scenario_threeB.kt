package coroutines

import kotlinx.coroutines.*


//see the "put countries-array in static context which loads prior to runtime"  commit in the capsQuiz project
fun scen03b() = runBlocking {
    println("scen03b")

    val deferredString: Deferred<String> =  async(Dispatchers.IO) {
        println("fetchDataFromServer-start(A)")
        delay(2000)
        println("fetchDataFromServer-finish(Af)")
        return@async "data from server"
    }

    //run on a background thread and alert the parent (main-ui) thread when done.
    val data = deferredString.await()
    //once data is available it will be populated
    println("showDataToUser(B)")
    println(data)




}
