package com.spring_boot.thymeleaf_curd.controller;

import com.spring_boot.thymeleaf_curd.entity.Employee;
import com.spring_boot.thymeleaf_curd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model model){
        List<Employee> employees=employeeService.findAll();
        model.addAttribute("employees",employees);
        return "list-employees";
    }
    @GetMapping("/showformforadd")
    public String addEmployee(Model model){
        model.addAttribute("employee",new Employee());
        return "employee-form";
    }


    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        return "redirect:/employees/list";
    }
    @GetMapping("/showformforupdate")
    public String updateEmployee(@RequestParam("employeeId")int id,Model model) throws Exception {
        Employee employee=employeeService.findById(id);
        model.addAttribute("employee",employee);
        return "employee-form";
    }
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId")int id) throws Exception {
        employeeService.deleteById(id);
        return "redirect:/employees/list";
    }
}
