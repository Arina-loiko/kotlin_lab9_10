package resources

data class OutpostResource(val id: Int, val name: String, var amount: Int) {
    override fun toString(): String {
        return "Resource[$id]: $name - $amount units"
    }
}

fun main() {
    val minerals = OutpostResource(1, "Minerals", 100)
    val gas = OutpostResource(2, "Gas", 50)

    println(minerals)
    println(gas)

    val bonusMinerals = minerals.copy(amount = minerals.amount + 50)
    println("With bonus: $bonusMinerals")
}
