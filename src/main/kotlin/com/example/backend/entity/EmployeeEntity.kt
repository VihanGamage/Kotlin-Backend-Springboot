package com.example.backend.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "employees")
data class EmployeeEntity(
    @Id
    val id:String?,
    var name:String,
    var departmentId:String,
)