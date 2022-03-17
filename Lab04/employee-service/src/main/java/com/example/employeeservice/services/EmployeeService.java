package com.example.employeeservice.services;

import com.example.employeeservice.entitites.Employee;
import com.example.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public Employee findEmployeeById(String userId) {
        return employeeRepository.findEmployeeById(userId);
    }
}
