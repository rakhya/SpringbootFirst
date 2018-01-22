package com.rakhya.SpringbootFrist.models;

import javax.persistence.Entity;

@Entity
public class Student {
	
	private int id;
	private String name;
	private String standard;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
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
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
}
