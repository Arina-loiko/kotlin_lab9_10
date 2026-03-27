package employeetracker

fun main() {
    val emp = Employee("Иванов Иван Иванович", "Developer", 80000, 5)
    println("Name: ${emp.fullName}, Position: ${emp.position}")
    println("Salary: ${emp.salary}, Experience: ${emp.yearsOfExperience}")

    emp.salary = -5000
    println("Salary after negative attempt: ${emp.salary}")

    emp.yearsOfExperience = 100
    println("Experience after 100 attempt: ${emp.yearsOfExperience}")
}
