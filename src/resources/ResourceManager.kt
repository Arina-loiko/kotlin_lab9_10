package resources

class ResourceManager {
    private val resources: MutableList<OutpostResource> = mutableListOf()

    fun add(resource: OutpostResource) {
        resources.add(resource)
    }

    fun get(name: String): OutpostResource? {
        return resources.find { it.name == name }
    }

    fun printAll() {
        resources.forEach { println(it) }
    }
}
