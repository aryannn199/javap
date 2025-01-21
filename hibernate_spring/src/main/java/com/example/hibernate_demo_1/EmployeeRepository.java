package com.example.hibernate_demo_1;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	// Create and Update
	public Employee save(Employee e) {
		if (e.getId()==null) {
			entityManager.persist(e);
		}
		else {
			entityManager.merge(e);
		}
		return e;
		
		}
	
	// get Employee by ID 
	
	public Employee findById(Long id) {
		return entityManager.find(Employee.class, id);
		
	}
	
	// Get All Employee Data 
	
	public List<Employee> findAll(){
		return entityManager.createQuery("from Employee", Employee.class).getResultList();
		
	}
	// Delete the Employee
	public void deleteById(Long id) {
		Employee e=entityManager.find(Employee.class, id);
		if(e!=null) {
			entityManager.remove(e);
			
		}
	}
	
	

}
