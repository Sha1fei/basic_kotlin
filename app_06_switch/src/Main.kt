enum class Color {
    RED,
    YELLOW,
    GREEN,
    BLUE
}

fun main() {
    // when === switch в котлин
    var x = 1
    val result = when (x) {
        0, 1 -> "binary"
        else -> "error"
    }
    println(result)

    // с использованием in
    val zarplata = 1000
    val cost = when (zarplata) {
        in 1..10 -> "издеваетесь?"
        in 10..100 -> "маловато будет"
        in 100..1000 -> "кота прокормлю"
        in 1000..1000000 -> "на хлеб с икрой!"
        else -> "not rated"
    }
    println(cost)

    // с использованием перечисления

    fun getWarmth(color: Color) = when(color){
        Color.RED, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE -> "cold"
        else -> "unknown"
    }

    println(getWarmth(Color.YELLOW))
}