import modules.EnergyGenerator
import modules.ResearchLab
import resources.OutpostResource
import resources.ResourceManager

fun main() {
    val manager = ResourceManager()

    manager.add(OutpostResource(1, "Minerals", 100))
    manager.add(OutpostResource(2, "Gas", 50))

    val generator = EnergyGenerator("Solar Generator")
    val lab = ResearchLab("Research Lab")

    generator.execute(manager)
    lab.execute(manager)

    manager.printAll()
}
