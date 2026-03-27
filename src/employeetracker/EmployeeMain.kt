package employeetracker

fun main() {
    val emp = Employee("Иванов Иван Иванович", "Developer", 80000, 5)
    println("Name: ${emp.fullName}, Position: ${emp.position}")
    println("Salary: ${emp.salary}, Experience: ${emp.yearsOfExperience}")

    emp.salary = -5000
    println("Salary after negative attempt: ${emp.salary}")

    emp.yearsOfExperience = 100
    println("Experience after 100 attempt: ${emp.yearsOfExperience}")

    val task1 = Task("Fix bug", "Fix login bug", Priority.HIGH)
    val task2 = Task("Fix bug", "Fix login bug", Priority.HIGH)
    val task3 = Task("Add feature", "Add dark mode", Priority.MEDIUM)

    println("\ntask1 == task2: ${task1 == task2}")
    println("task1 == task3: ${task1 == task3}")
    println("task1.hashCode() == task2.hashCode(): ${task1.hashCode() == task2.hashCode()}")

    println("\ntask1: $task1")

    val task1Copy = task1.copy(priority = Priority.LOW)
    println("task1 copy with LOW priority: $task1Copy")
}
