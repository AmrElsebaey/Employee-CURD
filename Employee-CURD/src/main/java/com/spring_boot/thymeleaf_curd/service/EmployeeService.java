package com.spring_boot.thymeleaf_curd.service;

import com.spring_boot.thymeleaf_curd.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    void save(Employee employee);
    Employee findById(int id) throws Exception;
    void deleteById(int id) throws Exception;
}
