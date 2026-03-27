package modules

import actions.ModuleAction
import resources.ResourceManager

class ResearchLab(name: String) : OutpostModule(name), ModuleAction {
    override fun performAction(manager: ResourceManager) {
        val minerals = manager.get("Minerals")
        if (minerals == null || minerals.amount < 30) {
            println("$name: not enough minerals for research!")
            return
        }
        minerals.amount -= 30
        println("$name is conducting research...")
    }

    override fun execute(manager: ResourceManager) {
        performAction(manager)
    }
}
