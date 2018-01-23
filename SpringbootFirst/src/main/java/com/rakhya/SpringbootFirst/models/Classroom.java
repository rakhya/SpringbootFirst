package com.rakhya.SpringbootFirst.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Classroom {
	
	@Id
	private int id;
	private String name;
	private String section;
	    
	public Classroom() {
		
	}
	
	public Classroom(int id, String name, String section) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
		
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

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	
}
