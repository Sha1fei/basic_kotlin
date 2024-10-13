const val z = "meow"; // не изменяемое значениеб нужно сразу инициализировать
fun main() {
    //Basic types
    val a: Int = 123; //целочисленное значение
    val b: Double = 123.456; //дробное значение
    val c: Char = 'a'; //символ
    val d: String = "Hello, World!"; //строка
    val e: Boolean = true; //логическое значение

    println("a: " + a)
    println("b: " + b)
    println("c: " + c)
    println("d: " + d)
    println("e: " + e)

    //Nullability
    var nullableVariable: String? = "Hello, World!"; //может быть null
    nullableVariable = null; //можно присвоить null
    println(nullableVariable); //выведет null

    //Arrays
    val array = arrayOf(1, 2, 3, 4, 5); //массив из целых чисел
    println("array[2]: " + array[2]); //выведет 3

    //Maps
    val map = hashMapOf(1 to "one", 2 to "two");
    println("map[2]: " + map[2])

    //Others val, var, const

    val x = 1; //не изменяемый тип и значение
    var y = "Test"; //изменяемое значение, но не изменяемый тип, может вычисляться runtime
    println("val: " + x)
    println("var: " +y)
    println("const: " + z);

    // return type
    println(d::class)

    //to upper/lower case
    println("uppercaseChar: " + c.uppercaseChar())
    println("lowercase: " + d.lowercase())

    //maxof
    println("maxOf: " + maxOf(a, x))

}