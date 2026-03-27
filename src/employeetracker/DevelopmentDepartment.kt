package employeetracker

class DevelopmentDepartment : Department(), ReportGenerator {
    override val departmentName: String = "Development"

    override fun printDepartmentGoal() {
        println("$departmentName goal: write clean code")
    }

    override fun generateReport(): String {
        return "Department report - Name: $departmentName, Goal: write clean code"
    }
}
