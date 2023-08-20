package com.example.backend.service

import com.example.backend.entity.EmployeeEntity

interface EmployeeService {
    fun getEmployee(id:String): EmployeeEntity
    fun addEmployee(employeeEntity: EmployeeEntity):EmployeeEntity
    fun deleteEmployee(id: String)
    fun getAll():List<EmployeeEntity>
    fun editEmployee(employeeEntity: EmployeeEntity):EmployeeEntity
    fun findByName(name:String):List<EmployeeEntity>
}