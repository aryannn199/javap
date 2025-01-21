package com.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		EmployeeDAO edao= context.getBean("employeedao",EmployeeDAO.class);
		
		Employee e=new Employee(3, "Soni", "soni@gmail.com");
		System.out.println("Adding Employee:");
		System.out.println(edao.addEmployee(e));
		
		System.out.println();
		
		System.out.println("Employee Data exicuted Using ResultSetExtractor:");
		List<Employee> ep1=edao.getAllEmployee();
		for(Employee e1: ep1) {
			System.out.println(e1.getId()+":"+e1.getName()+":"+e1.getEmail());
			
		}
		System.out.println();
		
		System.out.println("Employee Data Exicuted Using Rowmapper: ");
		List<Employee> ep2=edao.getAllEmployee();
		for(Employee e1: ep2) {
			System.out.println(e1.getId()+":"+e1.getName()+":"+e1.getEmail());
		
			
		}
		
		
	}

}
