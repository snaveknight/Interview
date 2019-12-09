package com.example.Interview.controller;

import com.example.Interview.dao.EmployeeDao;
import com.example.Interview.dao.JDBCEmployeeDao;
import com.example.Interview.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/employees")
public class RestEmployeeController {

    @Autowired
    private EmployeeDao employeeDao;


    @GetMapping
    public List<Employee> getAllEmployeesEndPoint() {
        List<Employee> allEmployees = employeeDao.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployeeByIdEndPoint(@PathVariable String employeeId) {
        Employee thisEmployee = employeeDao.getEmployeeById(employeeId);
        return thisEmployee;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee createEmployeeEndPoint(@RequestBody Employee employee) {
        return employeeDao.addNewEmployee(employee);
    }

    @PutMapping("/{employeeId}")
    public Employee update(@RequestBody Employee employee, @PathVariable String employeeId) {
        employee.setEmployeeId(employeeId);
        Employee thisEmployee = employeeDao.updateEmployee(employee);
        return employeeDao.updateEmployee(thisEmployee);
    }

    @DeleteMapping ("{employeeId}")
    public void delete(@PathVariable String employeeId) {
        employeeDao.deleteEmployee(employeeId);
    }
}

