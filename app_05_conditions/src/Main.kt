fun main() {
    var number = 5
    if (number > 0) {
        println("x больше чем 0")
    } else if (number == 0) {
        println("x равен 0")
    } else {
        println("x меньше чем 0")
    }

    // пример использования is
    var value = 9
    if (value is Int) {
        println("$value является Integer")
    }

    // пример использования if аналог char
    var age = 5
    val catChar = if (age > 15) "Старый" else "Молодой"
    println("Кот - " + catChar)
}