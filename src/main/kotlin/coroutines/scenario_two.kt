package coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun scen02() = runBlocking {
    println("scen02")

    launch(Dispatchers.IO) {
        println("fetchDataFromServer-start(A)")
        delay(2000)
        println("fetchDataFromServer-finish(Af)")
    }

    println("showDataToUser(B)")




}
