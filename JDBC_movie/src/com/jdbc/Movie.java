package com.jdbc;

public class Movie {
	private int id;
	
	// genetate getter setter and constructor 
	
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//generating fields 
	public Movie(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
