package employeetracker

class TestingDepartment : Department() {
    override val departmentName: String = "Testing"

    override fun printDepartmentGoal() {
        println("$departmentName goal: find all bugs")
    }
}
