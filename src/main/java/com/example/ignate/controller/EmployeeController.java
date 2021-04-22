package com.example.ignate.controller;

import com.example.ignate.entity.Employee;
import com.example.ignate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "employee/{id}")
    public Employee findEmployeeById(@PathVariable String id)
    {
        System.out.println("Searching by ID  : " + id);
        return employeeService.getEmployeeByID(id);
    }

    @PutMapping(value = "employee/{id}/{name}")
    public Employee findEmployeeById(@PathVariable String id,@PathVariable String name)
    {
        System.out.println("Updating by ID  : " + id);
        return employeeService.updateEmployee(id,name);
    }

    @DeleteMapping(value = "employee/{id}")
    public ResponseEntity<?> deleteEmployeeById(@PathVariable String id)
    {
        System.out.println("Updating by ID  : " + id);
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
