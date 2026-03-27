package modules

import resources.ResourceManager

abstract class OutpostModule(val name: String, var level: Int = 1) {
    fun upgrade() {
        level++
        println("$name upgraded to level $level!")
    }

    abstract fun performAction(manager: ResourceManager)
}
