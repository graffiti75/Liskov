package br.example.liskov

import br.example.liskov.interfaces.ManagerInterface

class CEO: BaseEmployee(), ManagerInterface {
    override fun calculateMonthlySalary(rank: Int) {
        this.salary = (12.5 + (rank * 4)) * 220
    }

    override fun generatePerformanceReview() {
        println("I am generating performance review as CEO")
    }

    fun fireSomeone(employee: Employee) {
        println("${employee.firstName}, you are fired!")
    }
}