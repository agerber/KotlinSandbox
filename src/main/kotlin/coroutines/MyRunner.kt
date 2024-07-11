package coroutines

import edu.uchicago.gerber.code.*
import main69
import main70
import main71
import main72
import main73
import main74
import main75
import main76
import main77
import main78

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
       // "main66" -> main66()
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

        else -> println("Unknown function: ${args[0]}")
    }
}
