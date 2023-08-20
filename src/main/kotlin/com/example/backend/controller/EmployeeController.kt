package com.example.backend.controller

import com.example.backend.entity.EmployeeEntity
import org.springframework.web.bind.annotation.*
import com.example.backend.service.EmployeeService

@RestController
@CrossOrigin(origins = ["http://localhost:3000"], maxAge=3600, allowCredentials = "true")
@RequestMapping("/employee")
class EmployeeController(val employeeService: EmployeeService){

    @GetMapping("/{id}")
    fun getEmployee(@PathVariable id:String): EmployeeEntity {
        return  employeeService.getEmployee(id)
    }

    @PostMapping("")
    fun addEmployee(@RequestBody employeeEntity: EmployeeEntity): EmployeeEntity {
        return employeeService.addEmployee(employeeEntity)
    }

    @DeleteMapping("/{id}")
    fun deleteEmployee(@PathVariable id:String){
        return employeeService.deleteEmployee(id)
    }

    @GetMapping("/all")
    fun getAll():List<EmployeeEntity>{
        return employeeService.getAll()
    }

    @PutMapping("/put")
    fun editEmployee(@RequestBody employeeEntity: EmployeeEntity): EmployeeEntity {
        return employeeService.editEmployee(employeeEntity)
    }

    @GetMapping("/name/{name}")
    fun findByName(@PathVariable name:String):List<EmployeeEntity>{
        return employeeService.findByName(name)
    }
    
}