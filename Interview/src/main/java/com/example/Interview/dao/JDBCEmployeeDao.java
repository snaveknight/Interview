package com.example.Interview.dao;

import com.example.Interview.model.Employee;
import org.h2.jdbcx.JdbcDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class JDBCEmployeeDao implements EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCEmployeeDao() {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:mem:testdb");
        dataSource.setUser("sa");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        SqlRowSet sqlResults = jdbcTemplate.queryForRowSet("SELECT * FROM employee");

        while (sqlResults.next()) {
            Employee employee = new Employee();
            employee.setEmployeeId(sqlResults.getString("employee_id"));
            employee.setFirstName(sqlResults.getString("first_name"));
            employee.setLastName(sqlResults.getString("last_name"));
            employee.setCompanyEmail(sqlResults.getString("company_email"));
            employee.setBirthDate(sqlResults.getDate("birth_date"));
            employee.setHireDate(sqlResults.getDate("hire_date"));
            employee.setRole(sqlResults.getString("role"));
            employeeList.add(employee);
        }

        return employeeList;
    }

    @Override
    public Employee getEmployeeById(String employeeId) {
        String sqlThisEmployee = "SELECT * FROM employee WHERE employee_id = ?";
        SqlRowSet sqlResults = jdbcTemplate.queryForRowSet(sqlThisEmployee, employeeId);

        sqlResults.next();
        Employee employee = new Employee();
        employee.setEmployeeId(sqlResults.getString("employee_id"));
        employee.setFirstName(sqlResults.getString("first_name"));
        employee.setLastName(sqlResults.getString("last_name"));
        employee.setCompanyEmail(sqlResults.getString("company_email"));
        employee.setBirthDate(sqlResults.getDate("birth_date"));
        employee.setHireDate(sqlResults.getDate("hire_date"));
        employee.setRole(sqlResults.getString("role"));

        return employee;
    }

    @Override
    public Employee addNewEmployee(Employee employee) {
        String insertSql = "Insert Into employee (employee_id, first_name, last_name, company_email, birth_date, hire_date, " +
                "role) Values (?,?,?,?,?,?,?)";

        jdbcTemplate.update(insertSql, employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(), employee.getCompanyEmail(),
                employee.getBirthDate(), employee.getHireDate(), employee.getRole());
        String insertSqlAddress = "Insert Into address (address_id, street, city, region, postal, country)" +
                "Values (?,?,?,?,?,?)";
        jdbcTemplate.update(insertSqlAddress,  employee.getAddressId(), employee.getStreet(), employee.getCity(),
                employee.getRegion(), employee.getPostal(), employee.getCountry());
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        String insertSql = "Update employee Set first_name= ?, last_name= ?, company_email= ?, birth_date = ?, " +
                "hire_date= ?, role= ? " +
                "Where employee_id = ?";
        jdbcTemplate.update(insertSql, employee.getFirstName(), employee.getLastName(), employee.getCompanyEmail(), employee.getBirthDate(),
                employee.getHireDate(), employee.getRole(), employee.getEmployeeId());

        return employee;
    }

    @Override
    public void deleteEmployee(String employeeId) {
    String insertSql = "Delete From employee_address Where employee_id = ?;";
    jdbcTemplate.update(insertSql, employeeId);
    String insertSql2 = "Delete From employee_skill Where employee_id = ?";
    jdbcTemplate.update(insertSql2, employeeId);
    String insertSql3 = "Delete From employee Where employee_id = ?";
    jdbcTemplate.update(insertSql3, employeeId);
    }
}
