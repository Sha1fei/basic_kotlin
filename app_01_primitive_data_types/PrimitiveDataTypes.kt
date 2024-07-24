package app_01_primitive_data_types

fun main() {
    val byte: Byte = 24;
    println("Byte: $byte")
    val short: Short = 30000;
    println("Short: $short")
    val int: Int = 1000000;
    println("Int: $int")
    val long: Long = 1000000000L;
    println("Long: $long")
    val float: Float = 3.14f;
    println("Float: $float")
    val double: Double = 2.71828;
    println("Double: $double")
    val char: Char = 'A';
    println("Char: $char")
    val boolean: Boolean = true;
    println("Boolean: $boolean")

    val intValue: Int = "101".toInt()
    println(intValue)

}