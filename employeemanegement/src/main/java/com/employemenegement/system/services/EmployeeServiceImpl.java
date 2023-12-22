package com.employemenegement.system.services;

import com.employemenegement.system.entities.Employee;
import com.employemenegement.system.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmplyeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void addEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
       List<Employee> list=  this.employeeRepository.findAll();
        return list;
    }

    @Override
    public Employee getEmployee(long id ) {
        Employee employee=null;
        try{
            employee = employee=this.employeeRepository.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
         return employee;
    }

    @Override
    public void updateEmployee(long id, Employee employee) {
        employee.setId(id);
         this.employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        this.employeeRepository.deleteById(id);

    }

    @Override
    public void deleteAllEmployee() {
        this.employeeRepository.deleteAll();
    }


}
