import com.github.javafaker.Beer
import com.github.javafaker.Faker
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

var nCount = 0
val faker = Faker()

//FLOW
fun main() {
    runBlocking {

        beerFlowSource()
            //.filter { beer -> beer.name().length > 10  }
            //.map { beer -> beer.hop() }
            .collect { b ->
                val nFormatted = "%02d".format(++nCount)
                println("$nFormatted ${b.fullName()}")
            }

    }
}
fun Beer.fullName(): String {
       return "${this.name()} ${this.hop()} | ${this.malt()} | ${this.style()} "
}


//99 bottles of beer on the wall,...99 bottle of beer...
fun beerFlowSource(): Flow<Beer> {

    return flow<Beer> {
        for (nCount in 99 downTo 1) {
            delay(50)
            emit(faker.beer())
        }
    }

}















