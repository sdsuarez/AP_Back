package com.sd.project.services;

import java.util.List;


import com.sd.project.entity.Employee;

public interface EmployeeService {
    public Employee save(Employee employee);
    public Employee findByIdEmployee(Long id);
    public List<Employee> findAllEmployee();
    public void deleteEmployee(Long id);

}
