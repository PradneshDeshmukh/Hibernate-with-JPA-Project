package com.exam;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	private int id;
	private String name;
	private int salary;
	
	
	public Author() {
		super();
	}


	public Author(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
