package br.example.liskov

import br.example.liskov.interfaces.ManagerInterface

class Manager: Employee(), ManagerInterface {
    override fun calculateMonthlySalary(rank: Int) {
        this.salary = (19.5 + (rank * 4)) * 220
    }

    override fun generatePerformanceReview() {
        println("I am generating performance review as br.example.liskov.Manager")
    }

}