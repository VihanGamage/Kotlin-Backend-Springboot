package com.example.backend.repository

import com.example.backend.entity.EmployeeEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : MongoRepository<EmployeeEntity,String>{
    fun findByName(name:String):List<EmployeeEntity>
}