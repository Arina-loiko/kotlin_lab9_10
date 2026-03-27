import resources.OutpostResource
import resources.ResourceManager

fun main() {
    val manager = ResourceManager()
    val minerals = OutpostResource(1, "Minerals", 100)
    val gas = OutpostResource(2, "Gas", 50)

    manager.add(minerals)
    manager.add(gas)
    manager.printAll()

    val bonusMinerals = minerals.copy(amount = minerals.amount + 50)
    println("With bonus: $bonusMinerals")
}
