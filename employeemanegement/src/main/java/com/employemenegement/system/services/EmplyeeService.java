package com.employemenegement.system.services;

import com.employemenegement.system.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmplyeeService {

    public void addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployee(long id);
    public void updateEmployee(long id, Employee employee);
    public void deleteEmployee(long id);
    public void deleteAllEmployee();
}
