
fun main(vararg args: String){

  Converter.getF(100.0)

}
object Converter{


    fun getF( dCelcius:Double) : Double{
        return dCelcius * 9 / 5 + 32
    }

}

