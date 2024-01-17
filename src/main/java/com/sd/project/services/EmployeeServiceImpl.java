package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.Employee;
import com.sd.project.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findByIdEmployee(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    
}
