package br.example.liskov

import org.junit.Test

class EmployeeUnitTest {
    @Test
    fun checkEmployeeHierarchy() {
        val manager = Manager()
        manager.firstName = "Jack"
        manager.lastName = "Jones"
        manager.calculateMonthlySalary(4)

        val employee = CEO()

        employee.firstName = "Mark"
        employee.lastName = "Jackson"
        employee.calculateMonthlySalary(4)

        printPayroll(employee)
    }

    private fun printPayroll(employee: BaseEmployee) {
        println("${employee.firstName} salary is $${employee.salary}")
    }
}