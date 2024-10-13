fun main() {
    var customString: String? = null
    // ?.
    println(customString?.uppercase()) // вызовется только если null
    // !!.
    customString = "Hello, World!" // присвоили новое значение
    println(customString!!.lowercase()) // вызовется всегда - доверяем прогеру
    // ?:
    customString = null ?: "Test"; // если null, то вернет дефотное значение
    println(customString)
    // let
    customString = null ?: "Test2";
    customString?.let { println(it.uppercase()) } // let выполнит операцию если customString != null
}