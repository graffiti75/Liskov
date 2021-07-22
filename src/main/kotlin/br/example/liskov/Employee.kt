package br.example.liskov

import br.example.liskov.interfaces.ManagedInterface

open class Employee: BaseEmployee(), ManagedInterface {
    override lateinit var firstName: String
    override lateinit var lastName: String
    override lateinit var manager: Employee
    override var salary: Double = 0.0

    override fun assignManager(manager: Manager) {
        this.manager = manager
        // Do more logic
    }

    override fun calculateMonthlySalary(rank: Int) {
        this.salary = (12.5 + (rank * 2)) * 220
    }
}