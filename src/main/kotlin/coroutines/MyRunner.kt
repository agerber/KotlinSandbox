package coroutines

import other.main69
import other.main70
import other.main75
import other.main77
import mainWithTimeout
import other.*

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Please provide a function name to call")
        return
    }

    when (args[0]) {
        "main61" -> main61()
        "main62" -> main62()
        "main63" -> main63()
        "main64" -> main64()
        "main65" -> main65()
        "main68" -> main68()
        "main69" -> main69()
        "main70" -> main70()
        "main71" -> main71()
        "main72" -> main72()
        "main73" -> main73()
        "main74" -> main74()
        "main75" -> main75()
        "main76" -> main76()
        "main77" -> main77()
        "main78" -> main78()
        "scen01" -> scen01()
        "scen02" -> scen02()
        "scen03" -> scen03()
        "scen03b" -> scen03b()
        "scen03c" -> scen03c()
        "mainWithContext" -> mainWithContext()
        "mainWithTimeout" -> mainWithTimeout()
        "mainYield01" -> mainYield01()
        "mainYield02" -> mainYield02()
        "withTimeoutOrNull" -> withTimeoutOrNull()
        "mainLazy" -> mainLazy()
        "mainContexts" -> mainContexts()

        else -> println("Unknown function: ${args[0]}")
    }
}
