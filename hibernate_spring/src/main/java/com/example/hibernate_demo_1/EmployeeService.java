package com.example.hibernate_demo_1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository er;
	
	// create and update 
	public Employee saveEmployee(Employee e) {
		return er.save(e);
		
	}
	// Get by Id 
	public Employee getEmployeeById(Long id) {
		return er.findById(id);
		
	}
	// get all Employee 
	public List<Employee>getAllEmployees(){
		return er.findAll();
		
		
	}
	// Delete all Employee 
	public void deleteEmployee(Long id) {
		er.deleteById(id);
		
		
	}

}
