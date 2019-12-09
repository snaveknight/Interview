package com.example.Interview.dao;

import com.example.Interview.model.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(String employeeId);

    Employee addNewEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    public void deleteEmployee(String employeeId);
}
