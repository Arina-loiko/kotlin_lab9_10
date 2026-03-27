package characters

class Hero(val name: String) {
    var health: Int = 100
        set(value) {
            field = value.coerceIn(0, 100)
        }

    val stamina: Int = 50
        get() = field + 10

    var level: Int = 1
        private set

    fun levelUp() {
        level++
        println("$name reached level $level!")
    }
}

fun main() {
    val hero = Hero("Artur")
    hero.health = 80
    println("Health: ${hero.health}, Stamina: ${hero.stamina}")
    // hero.level = 5 // error - cannot set from outside
    hero.levelUp()
    println("Level: ${hero.level}")
}
