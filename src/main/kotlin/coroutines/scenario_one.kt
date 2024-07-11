package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun scen01() = runBlocking {
    println("scen01")
    println("fetchDataFromServer-start(A)")  // edu.uchicago.gerber.code.main thread
    delay(2000)
    println("fetchDataFromServer-finish(Af)")
    println("showDataToUser(B)")

}
