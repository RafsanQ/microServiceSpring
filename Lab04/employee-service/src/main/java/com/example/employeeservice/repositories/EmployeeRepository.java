package com.example.employeeservice.repositories;

import com.example.employeeservice.entitites.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee findEmployeeById(String userId);
}
