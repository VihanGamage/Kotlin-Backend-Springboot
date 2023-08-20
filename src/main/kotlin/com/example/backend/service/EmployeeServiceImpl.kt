package com.example.backend.service

import com.example.backend.entity.EmployeeEntity
import org.springframework.stereotype.Service
import com.example.backend.repository.EmployeeRepository
import com.example.backend.service.EmployeeService

@Service
class EmployeeServiceImpl (val employeeRepository: EmployeeRepository): EmployeeService {

    override fun getEmployee(id:String): EmployeeEntity {
        return employeeRepository.findById(id).orElseThrow{RuntimeException("not found")}
    }

    override fun addEmployee(employeeEntity: EmployeeEntity):EmployeeEntity {
        return employeeRepository.save(employeeEntity)
    }

    override fun deleteEmployee(id: String) {
        return employeeRepository.deleteById(id)
    }

    override fun getAll(): List<EmployeeEntity> {
        return employeeRepository.findAll()
    }

    override fun editEmployee(employeeEntity: EmployeeEntity): EmployeeEntity {
        return employeeRepository.save(employeeEntity)
    }

    override fun findByName(name: String): List<EmployeeEntity> {
        return employeeRepository.findByName(name)
    }
}