package app_02_null_protected

fun main() {
    var name: String? = null ?: "empty";  // 1) name может быть null 2) ?:, чтобы дать альтернативное значение, если объект равен null
    name?.let {  // сработает если name не null
        println(it.length)
    }
    println(name?.get(0)); // Можем печатать, если name != null
    println(name!!.get(0)); // Сообщаем комилятору что уверены что String не null
    println("Hello, $name!")
}