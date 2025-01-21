package com.example.hibernate_demo_1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService es;
    
    // create and update 
    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e){
        return ResponseEntity.ok(es.saveEmployee(e));
    }
    
    // Get by Id 
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeebyid(@PathVariable Long id){
        Employee e = es.getEmployeeById(id);
        if(e != null) {
            return ResponseEntity.ok(e);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Get all Employees 
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(es.getAllEmployees());
    }
    
    // Delete Employee 
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
        es.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
