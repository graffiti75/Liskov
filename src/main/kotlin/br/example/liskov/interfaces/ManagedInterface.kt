package br.example.liskov.interfaces

import br.example.liskov.Employee
import br.example.liskov.Manager

interface ManagedInterface {
    var manager: Employee

    fun assignManager(manager: Manager)
}