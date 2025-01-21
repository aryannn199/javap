package com.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {
	private JdbcTemplate jdbctemplate;
	// Generate only setter 

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public Boolean addEmployee(final Employee e) {
		String query ="insert into employee value(?, ?, ?)";
		return jdbctemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement arg0) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
				arg0.setInt(1, e.getId());
				arg0.setString(2, e.getName());
				arg0.setString(3,  e.getEmail());
	
				return arg0.execute();
			}
		} );
		
	}
	
	public List<Employee> getAllEmployee(){
		String query="select * from employee";
		return jdbctemplate.query(query  , new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet arg0) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Employee> employees = new ArrayList<Employee>();
				
				while (arg0.next()) {
					Employee e=new Employee();
					e.setId(arg0.getInt(1));
					e.setName(arg0.getString(2));
					e.setEmail(arg0.getString(3));
					
					employees.add(e);
					
				}
				return employees;
			}
	
		});
	}
	
	public List<Employee> getEmployees(){
		String query="select * from employee";
		List<Employee> employees=jdbctemplate.query(query, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet arg0, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Employee e=new Employee();
				e.setId(arg0.getInt(1));
				e.setName(arg0.getString(2));
				e.setEmail(arg0.getString(3));
				return e;
				
			
			}
			
		});
		return employees;
	}
	
	
		
}
