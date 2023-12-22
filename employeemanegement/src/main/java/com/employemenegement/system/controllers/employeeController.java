package com.employemenegement.system.controllers;
import com.employemenegement.system.entities.Employee;
import com.employemenegement.system.services.EmplyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class employeeController {
    @Autowired
    private EmplyeeService emplyeeService;

    @PostMapping("/employee")
    public ResponseEntity<Void> addEmployee(@RequestBody Employee employee){

        try {
                 this.emplyeeService.addEmployee(employee);
                 return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List list = emplyeeService.getAllEmployees();
        if(list.size()<=0){
            ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
    @GetMapping("/employee/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable String empId){

       Employee employee = this.emplyeeService.getEmployee(Long.parseLong(empId));
       if(employee == null){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }
       return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
    @DeleteMapping("/employee")
    public ResponseEntity<Void> deleteAllEmployee(){
        try {
            this.emplyeeService.deleteAllEmployee();
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @DeleteMapping("/employee/{empid}")
    public ResponseEntity<Void>  deleteEmployeeById(@PathVariable String empid){
        try {
            this.emplyeeService.deleteEmployee(Long.parseLong(empid));
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping("/employee/{empid}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable String empid , @RequestBody Employee employee){
        try {
            this.emplyeeService.updateEmployee(Long.parseLong(empid), employee);
            return ResponseEntity.ok().body(employee);
        }catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
