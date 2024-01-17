package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.Department;
import com.sd.project.repository.DepartmentRepository;

public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department findByIdDepartment(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Department> findAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
    
}
