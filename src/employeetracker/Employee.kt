package employeetracker

class Employee(
    fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int
) {
    var fullName: String = fullName
        private set
    var position: String = position
        private set
    var salary: Int = salary
        set(value) {
            if (value < 0) {
                println("Warning: salary cannot be negative")
                field = 0
            } else {
                field = value
            }
        }
    var yearsOfExperience: Int = yearsOfExperience
        set(value) {
            field = value.coerceIn(0, 50)
        }
}
