// простое задание enum
enum class CatSimple {
    VIBRISSAE, PAWS, TAIL
}
// создание enum c заданием значения и функцией обработки
enum class Country(val capital: String) {
    Russia("Moscow"),
    USA("New-York"),
    Belarus("Minsk");
    fun addExclamationMark():String {
        return this.capital.toString() + "!";
    }
}

fun main() {
    // Получение значения и именования поля Enum
    println(CatSimple.VIBRISSAE.name + ": " + CatSimple.VIBRISSAE.ordinal)

    //Пробежаться по полям enum
    for(cat in CatSimple.values()){
        println(cat.name + ": " + cat.ordinal)
    }

    //Пробежаться по полям enum c заданными зачениями и функцией обработки
    for(country in Country.values()){
        println(country.name + ", " + country.ordinal + ", " + country.capital)
        println(country.addExclamationMark())
    }


}