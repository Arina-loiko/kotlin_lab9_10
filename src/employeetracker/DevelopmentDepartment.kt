package employeetracker

class DevelopmentDepartment : Department() {
    override val departmentName: String = "Development"

    override fun printDepartmentGoal() {
        println("$departmentName goal: write clean code")
    }
}
