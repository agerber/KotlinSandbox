//TRAILING LAMBDAS, ETC
fun main(vararg args: String){
        //pass a lambda
        operateOn(15,5, {a:Int, b:Int -> (a/b)})

        //we can also assign the parameters out of order by calling their name like so
        operateOn (func={a:Int, b:Int -> (a+b)}, b= 5, a= 15)

        // if the last arg (as defined) is a function, you can put it outside the parens
        operateOn(24,8) {a:Int, b:Int -> (a-b)}

        // furthermore, if the parameters have default values, you can remove them
        operateOn() {a:Int, b:Int -> (a*b)}

}
//this is a higher-order function; it takes function(s) as parameters
fun operateOn(a: Int = 9, b: Int = 3, func: (Int, Int) -> Int){
        println( func(a,b))
}
