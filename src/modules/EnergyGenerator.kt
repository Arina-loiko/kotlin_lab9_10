package modules

import actions.ModuleAction
import resources.OutpostResource
import resources.ResourceManager

class EnergyGenerator(name: String) : OutpostModule(name), ModuleAction {
    override fun performAction(manager: ResourceManager) {
        println("$name is generating energy...")
        val energy = manager.get("Energy")
        if (energy != null) {
            energy.amount += 20
        } else {
            manager.add(OutpostResource(1, "Energy", 20))
        }
    }

    override fun execute(manager: ResourceManager) {
        performAction(manager)
    }
}
