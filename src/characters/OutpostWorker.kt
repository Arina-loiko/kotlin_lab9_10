package characters

class OutpostWorker(val name: String) {
    var maxEnergy: Int = 100
        private set

    var energy: Int = 100
        set(value) {
            field = value.coerceIn(0, maxEnergy)
        }

    val mood: Int
        get() = 50 + (energy / 10)

    var level: Int = 1
        private set

    fun work() {
        println("$name is working...")
        energy -= 15
        if (energy < 20) {
            println("Warning: $name has low energy!")
        }
    }

    fun rest() {
        println("$name is resting...")
        energy += 20
    }

    fun levelUp() {
        level++
        maxEnergy += 20
        println("$name reached level $level! Max energy: $maxEnergy")
    }
}

fun main() {
    val worker = OutpostWorker("Alex")
    println("Energy: ${worker.energy}, Mood: ${worker.mood}, Level: ${worker.level}")

    worker.work()
    worker.work()
    println("Energy: ${worker.energy}, Mood: ${worker.mood}")

    worker.rest()
    println("Energy: ${worker.energy}")

    // worker.level = 5 // error - cannot set from outside
    worker.levelUp()
    println("Level: ${worker.level}, Max energy: ${worker.maxEnergy}")
}
