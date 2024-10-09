package com.spring_boot.thymeleaf_curd.service;

import com.spring_boot.thymeleaf_curd.dao.EmployeeRepository;
import com.spring_boot.thymeleaf_curd.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee findById(int id) throws Exception {
        Optional<Employee> employee=employeeRepository.findById(id);

            return employee.orElseThrow(()->new Exception("Employee id is not found : "+id));
    }


    @Override
    public void save(Employee employee) {
    employeeRepository.save(employee);
    }


    @Override
    public void deleteById(int id) throws Exception {
        Employee employee=findById(id);
        employeeRepository.deleteById(id);
    }


}
