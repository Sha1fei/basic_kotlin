import kitten.someFun;
import java.util.*

//свойства-расширения существующего класса
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {

    // простое создание функции
    fun add(x: Int, y: Int): Int {
        return x + y
    }
    println(add(1, 2))

    // сокращенное задание функции
    fun max(a: Int, b: Int) = if (a > b) a else b
    println(max(1, 2))

    // задание именованных параметров
    fun sayHelloByName(firstName: String, secondName: String): String {
        return "Здравствуй $firstName $secondName"
    }
    println(sayHelloByName(secondName = "Иванов", firstName = "Иван")) // если задаем именование, то порядок не важен

    // параметры по умолчанию
    fun sayHello(firstName: String = "Петров", lastName: String = "Петя"): String {
        return "Привет, $firstName $lastName!"
    }
    println(sayHello()) // если не указываем имя или фамилию, то используются значения по умолчанию

    // переменное число аргументов
    fun sum(vararg numbers: Int): Int {
        var result = 0
        for (number in numbers) {
            result += number
        }
        return result
    }
    println(sum(1, 2, 3, 4, 5))

    // ничего не возвращает

    fun void(): Unit {
        println("Ничего не возвращает")
    }
    void();

    //вложенная функция
     fun nestedFunction(x: Int): Int {
        fun innerFunction(y: Int): Int {
            return y * 3
        }
        return innerFunction(x)
    }
    println(nestedFunction(3))

    // вызов имопртируемой функции
    println(someFun());

    // лямбда выражения
    val lambda1: (Int, Int) -> Int = { x, y -> x + y }
    val lambda2: (Int) -> Int = { it -> it*4 }
    val lambda3: (Int) -> String = { // если параметр один то его можно не задавать, а использовать it
        println(it * 5);
        "Возращаемой значение: " + it
    }
    println(lambda1(1, 2))
    println(lambda2(1))
    println(lambda3(5))

    // функция infix (Для этого в объявление функции нужно добавить модификатор infix.)
    // инфиксная нотация
    infix fun Int.isGreater1(value: Int): Boolean {
        return this > value
    }
    println("infix new: " + (3 isGreater1 9))

    // обычный способ
    fun Int.isGreater2(value: Int): Boolean {
        return this > value
    }
    println("infix old: " + (3.isGreater2(9)))

    //функция-расширения существующего класса
    fun Date.isSaturday(): Boolean = day == 6
    val now = Date();
    val saturday = now.isSaturday()
    println("isSaturday: " + saturday)

    // применение свойства расширения
        val sb = StringBuilder("Cat?")
        sb.lastChar = '!'
        println(sb)

    // функция-заглушка TODO()
    fun customTODO() {
        TODO("TODO функция вызвана");
    }

    //не стандартное именование функций в кавычках ``
    fun `12!cat`() = println("I am a cat!")
    `12!cat`()







}